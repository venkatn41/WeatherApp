package venkat.com.weatherapp.screens.main.core;

import android.util.Log;
import android.view.View;

import rx.Observer;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;
import venkat.com.weatherapp.model.forecast.ForecastResponse;
import venkat.com.weatherapp.utils.rx.RxSchedulers;

/**
 * Created by venkat on 2/3/18.
 *
 * This class is responsible for converting the observables from model to subscriptions
 * and update the views.
 */

public class MainPresenter {

    private static final String TAG = "MainPresenter";

    MainView view;
    MainModel model;
    CompositeSubscription subscriptions;
    RxSchedulers rxSchedulers;
    ForecastResponse forecastResponse;

    public MainPresenter(MainView view, MainModel model, RxSchedulers schedulers, CompositeSubscription sub) {
        this.view = view;
        this.model = model;
        this.rxSchedulers = schedulers;
        subscriptions = sub;
    }

    public void onCreate(String cordinates) {
        subscriptions.add(getDetails(cordinates));
        subscriptions.add(respondToClick());
    }

    public void onDestroy() {
        subscriptions.clear();
    }

    //Checks for network availability and
    //Two API calls are made
    //1) To get the place name for the given coordinates
    //2) TO get the Forecast for the given location
    // After the final response is received views are updated wuth data.
    public Subscription getDetails(String cordinates) {

        return model.isNetworkAvailable().doOnNext(networkAvailable -> {
            if (!networkAvailable) {
                Log.d(TAG, "No Internet Connection");
                view.checkInternetConnection();
            }
        }).
                filter(isNetworkAvailable -> true).
                flatMap(isNetworkAvailable -> model.provideCity(cordinates)).
                flatMap(place -> model.provideForecast(place.getLocation().getState(), place.getLocation().getCity())).
                subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.androidThread()).
                subscribe(forecastResponse -> {
                    this.forecastResponse = forecastResponse;
                    // updating the views with the response.
                    view.setValues(forecastResponse.getLocation().getCity(), forecastResponse.getCurrentObservation().getTemperatureString());
                        }, throwable -> {
                            Log.d(TAG, "failed ::" +throwable.toString());
                        }
                );
    }

    private Subscription respondToClick() {

        return view.buttonClickObservable().subscribe(new Observer<View>() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(View view) {
                model.goToFutureForecastDetailsListActivity(forecastResponse);
            }
        });
    }
}

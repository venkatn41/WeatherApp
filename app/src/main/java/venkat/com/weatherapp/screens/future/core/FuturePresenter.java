package venkat.com.weatherapp.screens.future.core;

import android.util.Log;

import java.util.ArrayList;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;
import venkat.com.weatherapp.model.futureForecast.ForecastdayItem;
import venkat.com.weatherapp.utils.rx.RxSchedulers;

/**
 * Created by venkat on 2/3/18.
 *
 * Presnter tunrs model Observables to subscriptions
 */

public class FuturePresenter {
    FutureView view;
    FutureModel model;
    CompositeSubscription subscriptions;
    RxSchedulers rxSchedulers;
    ArrayList<ForecastdayItem> forecastList = new ArrayList<>();

    private static final String TAG = "FuturePresnter";

    public FuturePresenter(FutureView view, FutureModel model, RxSchedulers schedulers, CompositeSubscription subscriptions) {
        this.view = view;
        this.model = model;
        this.rxSchedulers = schedulers;
        this.subscriptions = subscriptions;
    }

    public void onCreate(String state, String city){
        Log.d(TAG,"presenter oncreate");
        subscriptions.add(getFutureForecast(state, city));
        subscriptions.add(respondToClick());
    }

    public void onDestroy(){
        subscriptions.clear();
    }

    //Subscribes for button click
    private Subscription respondToClick() {
        return view.itemClicks().subscribe(integer -> {
            model.goToHourlyForecast(forecastList.get(integer).getDate().getYday());
        });
    }

    //Checks for network availability and
    // API call is made to get the forecast for next 10days.
    // After the response is received views are updated with data.
    private Subscription getFutureForecast(String state, String city) {
        return model.isNetworkAvailable().doOnNext(isAvailable -> {
            if(!isAvailable) {
                Log.d(TAG,"no connection");
            }
        }).
                filter(isNetworkAvailable -> true).
                flatMap(isAvailable -> model.getFutureForecast(state, city)).
                subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.androidThread()).
                        subscribe(futureForecastResponse -> {
                            forecastList = (ArrayList<ForecastdayItem>)futureForecastResponse.
                                    getForecast().getSimpleforecast().getForecastday();
                            Log.d(TAG,"list size :"+forecastList.size());
                            view.swapAdapter(forecastList);
                        }, throwable -> {
                            Log.d(TAG,"request failed :"+throwable.toString());
                        }
         );
    }
}

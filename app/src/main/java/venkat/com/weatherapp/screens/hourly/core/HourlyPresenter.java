package venkat.com.weatherapp.screens.hourly.core;

import android.util.Log;

import java.util.ArrayList;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;
import venkat.com.weatherapp.model.hourly.HourlyForecastItem;
import venkat.com.weatherapp.utils.rx.RxSchedulers;

/**
 * Created by venkat on 2/3/18.
 */

public class HourlyPresenter {

    private static String TAG = "HourlyPresenter";
    HourlyView view;
    HourlyModel model;
    RxSchedulers rxSchedulers;
    CompositeSubscription subscription;

    ArrayList<HourlyForecastItem> hourlyList =  new ArrayList<>();

    public HourlyPresenter(HourlyView view, HourlyModel model, RxSchedulers schduler, CompositeSubscription subscription) {
        this.view = view;
        this.model = model;
        this.subscription = subscription;
        this.rxSchedulers = schduler;
    }

    public void onCreate(String city, String state, int day) {
        subscription.add(getHourlyForecast(city, state, day));
    }

    public void onDestroy(){
        subscription.clear();
    }

    //Checks for network connection and
    // A API call is made to get the hourly forecast.
    // After the response is received views are updated.
    public Subscription getHourlyForecast(String city, String state, int day) {
        return model.isNetworkAvailable().doOnNext(isAvailable -> {
            if(!isAvailable) {
                Log.d(TAG,"no internet connection");
            }
        }).
                filter(isNetworkAvailable -> true).
                flatMap(isAvailable -> model.getFutureForecast(state, city)).
                subscribeOn(rxSchedulers.io()).observeOn(rxSchedulers.androidThread()).
                subscribe(hourlyResponse -> {
                    Log.d(TAG, "list size :"+hourlyList);
                    hourlyList = (ArrayList<HourlyForecastItem>) hourlyResponse.getForecast();
                    view.swapAdapter(hourlyList, day);
                        }, throwable -> {
                            Log.d(TAG,"request failed"+throwable.toString());
                        }
                );
    }
}

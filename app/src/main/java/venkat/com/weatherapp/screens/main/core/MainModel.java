package venkat.com.weatherapp.screens.main.core;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import venkat.com.weatherapp.api.WeatherApi;
import venkat.com.weatherapp.model.Location.Place;
import venkat.com.weatherapp.model.forecast.ForecastResponse;
import venkat.com.weatherapp.screens.main.MainActivity;
import venkat.com.weatherapp.utils.NetworkUtils;

/**
 * Created by venkat on 2/3/18.
 *
 * This is the model class of MVP. It is responsible for providing the observables
 * which are then subscribed by presenter.
 */

public class MainModel {

    MainActivity context;
    WeatherApi api;

    public MainModel(MainActivity activity, WeatherApi weatherApi) {
        context = activity;
        api = weatherApi;
    }
    //Observable for providing the city name based on coordinates provided.
    Observable<Place> provideCity(String cordinate) {
        return api.getCity(cordinate).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread());
    }

    //Observable for providing the forecast for the city and state provided
    Observable<ForecastResponse> provideForecast(String state, String city) {
        return api.getForeCast(state, city);
    }

    //Observable to check network availability
    Observable<Boolean> isNetworkAvailable() {
        return NetworkUtils.isNetworkAvailableObservable(context);
    }

    public void goToFutureForecastDetailsListActivity(ForecastResponse response) {
        context.goToFutureForecastDetailsListActivity(response);
    }


}

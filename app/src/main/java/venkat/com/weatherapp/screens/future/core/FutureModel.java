package venkat.com.weatherapp.screens.future.core;

import rx.Observable;
import venkat.com.weatherapp.api.WeatherApi;
import venkat.com.weatherapp.model.futureForecast.FutureForecastResponse;
import venkat.com.weatherapp.screens.future.FutureForecastListActivity;
import venkat.com.weatherapp.utils.NetworkUtils;

/**
 * Created by venkat on 2/3/18.
 */

public class FutureModel {

    FutureForecastListActivity context;
    WeatherApi api;

    public FutureModel(FutureForecastListActivity context, WeatherApi api) {
        this.context = context;
        this.api = api;
    }

    Observable<FutureForecastResponse> getFutureForecast(String state, String city) {
        return api.getFutureForecast(state, city);
    }

    Observable<Boolean> isNetworkAvailable() {
        return NetworkUtils.isNetworkAvailableObservable(context);
    }

    public void goToHourlyForecast(int day) {
        context.goToHourlyForecast(day);
    }

}

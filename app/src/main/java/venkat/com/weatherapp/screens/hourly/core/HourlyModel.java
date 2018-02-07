package venkat.com.weatherapp.screens.hourly.core;

import rx.Observable;
import venkat.com.weatherapp.api.WeatherApi;
import venkat.com.weatherapp.model.hourly.HourlyResponse;
import venkat.com.weatherapp.screens.hourly.HourlyForecastListActivity;
import venkat.com.weatherapp.utils.NetworkUtils;

/**
 * Created by venkat on 2/3/18.
 */

public class HourlyModel {

    HourlyForecastListActivity context;
    WeatherApi api;

    public HourlyModel(HourlyForecastListActivity context, WeatherApi api) {
        this.context = context;
        this.api = api;
    }

    Observable<HourlyResponse> getFutureForecast(String state, String city) {
        return api.getHourlyForecast(state, city);
    }

    Observable<Boolean> isNetworkAvailable() {
        return NetworkUtils.isNetworkAvailableObservable(context);
    }
}

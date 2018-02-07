package venkat.com.weatherapp.api;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;
import venkat.com.weatherapp.model.Location.Place;
import venkat.com.weatherapp.model.forecast.ForecastResponse;
import venkat.com.weatherapp.model.futureForecast.FutureForecastResponse;
import venkat.com.weatherapp.model.hourly.HourlyResponse;

/**
 * Created by venkat on 2/3/18.
 */

public interface WeatherApi {

    //API call to get the location details
    @GET("794b834d6d83ef88/geolookup/q/{cordinates}.json")
    Observable<Place> getCity(@Path("cordinates") String cordinate);

    //API call to get the forecast based on Location name
    @GET("794b834d6d83ef88/forecast/geolookup/conditions/q/{state}/{city}.json")
    Observable<ForecastResponse> getForeCast(@Path("state") String state, @Path("city") String city);

    //API call to get the 10 days forecast
    @GET("/api/794b834d6d83ef88/forecast10day/q/{state}/{city}.json")
    Observable<FutureForecastResponse> getFutureForecast(@Path("state") String state, @Path("city") String city);

    //API call to get the hourly forecast for 10 days.
    //http://api.wunderground.com/api/794b834d6d83ef88/hourly10day/q/CA/San_Francisco.json
    @GET("/api/794b834d6d83ef88/hourly10day/q/{city}/{state}.json")
    Observable<HourlyResponse> getHourlyForecast(@Path("state") String state, @Path("city") String city);


}

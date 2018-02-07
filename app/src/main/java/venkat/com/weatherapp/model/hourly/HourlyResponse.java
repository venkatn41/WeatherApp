package venkat.com.weatherapp.model.hourly;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import venkat.com.weatherapp.model.Location.Response;

/**
 * Created by venkat on 2/3/18.
 */

public class HourlyResponse {
    private Response response;

    @SerializedName("hourly_forecast")
    private List<HourlyForecastItem> forecast;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public List<HourlyForecastItem> getForecast() {
        return forecast;
    }

    public void setForecast(List<HourlyForecastItem> forecast) {
        this.forecast = forecast;
    }
}

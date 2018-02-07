package venkat.com.weatherapp.model.futureForecast;

import venkat.com.weatherapp.model.Location.Response;

/**
 * Created by venkat on 2/1/18.
 */

public class FutureForecastResponse {

    private Response response;
    private Forecast forecast;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }
}

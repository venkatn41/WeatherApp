package venkat.com.weatherapp.model.forecast;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import venkat.com.weatherapp.model.Location.Location;
import venkat.com.weatherapp.model.Location.Response;

/**
 * Created by venkat on 2/3/18.
 */

public class ForecastResponse implements Serializable{

        private Response response;
        private Location location;

        @SerializedName("current_observation")
        private CurrentObservation currentObservation;

        private Forecast forecast;

        public Response getResponse() {
            return response;
        }

        public void setResponse(Response response) {
            this.response = response;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public CurrentObservation getCurrentObservation() {
            return currentObservation;
        }

        public void setCurrentObservation(CurrentObservation currentObservation) {
            this.currentObservation = currentObservation;
        }

        public Forecast getForecast() {
            return forecast;
        }

        public void setForecast(Forecast forecast) {
            this.forecast = forecast;
        }
    }

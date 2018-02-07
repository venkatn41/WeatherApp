package venkat.com.weatherapp.model.forecast;

import java.util.List;

public class Simpleforecast{
	private List<ForecastdayItem> forecastday;

	public void setForecastday(List<ForecastdayItem> forecastday){
		this.forecastday = forecastday;
	}

	public List<ForecastdayItem> getForecastday(){
		return forecastday;
	}

	@Override
 	public String toString(){
		return 
			"Simpleforecast{" + 
			"forecastday = '" + forecastday + '\'' + 
			"}";
		}
}
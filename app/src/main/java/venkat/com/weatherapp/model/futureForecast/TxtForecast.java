package venkat.com.weatherapp.model.futureForecast;

import java.util.List;

public class TxtForecast{
	private String date;
	private List<ForecastdayItem> forecastday;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setForecastday(List<ForecastdayItem> forecastday){
		this.forecastday = forecastday;
	}

	public List<ForecastdayItem> getForecastday(){
		return forecastday;
	}

	@Override
 	public String toString(){
		return 
			"TxtForecast{" + 
			"date = '" + date + '\'' + 
			",forecastday = '" + forecastday + '\'' + 
			"}";
		}
}
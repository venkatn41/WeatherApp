package venkat.com.weatherapp.model.forecast;

public class Features{
	private int geolookup;
	private int forecast;
	private int conditions;

	public void setGeolookup(int geolookup){
		this.geolookup = geolookup;
	}

	public int getGeolookup(){
		return geolookup;
	}

	public void setForecast(int forecast){
		this.forecast = forecast;
	}

	public int getForecast(){
		return forecast;
	}

	public void setConditions(int conditions){
		this.conditions = conditions;
	}

	public int getConditions(){
		return conditions;
	}

	@Override
 	public String toString(){
		return 
			"Features{" + 
			"geolookup = '" + geolookup + '\'' + 
			",forecast = '" + forecast + '\'' + 
			",conditions = '" + conditions + '\'' + 
			"}";
		}
}

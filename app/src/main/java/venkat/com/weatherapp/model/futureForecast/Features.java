package venkat.com.weatherapp.model.futureForecast;

public class Features{
	private int forecast10day;

	public void setForecast10day(int forecast10day){
		this.forecast10day = forecast10day;
	}

	public int getForecast10day(){
		return forecast10day;
	}

	@Override
 	public String toString(){
		return 
			"Features{" + 
			"forecast10day = '" + forecast10day + '\'' + 
			"}";
		}
}

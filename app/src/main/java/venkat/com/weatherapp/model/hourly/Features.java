package venkat.com.weatherapp.model.hourly;

public class Features{
	private int hourly10day;

	public void setHourly10day(int hourly10day){
		this.hourly10day = hourly10day;
	}

	public int getHourly10day(){
		return hourly10day;
	}

	@Override
 	public String toString(){
		return 
			"Features{" + 
			"hourly10day = '" + hourly10day + '\'' + 
			"}";
		}
}

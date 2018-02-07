package venkat.com.weatherapp.model.forecast;

public class NearbyWeatherStations{
	private Pws pws;
	private Airport airport;

	public void setPws(Pws pws){
		this.pws = pws;
	}

	public Pws getPws(){
		return pws;
	}

	public void setAirport(Airport airport){
		this.airport = airport;
	}

	public Airport getAirport(){
		return airport;
	}

	@Override
 	public String toString(){
		return 
			"NearbyWeatherStations{" + 
			"pws = '" + pws + '\'' + 
			",airport = '" + airport + '\'' + 
			"}";
		}
}

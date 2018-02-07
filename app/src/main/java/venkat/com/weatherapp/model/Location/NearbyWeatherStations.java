package venkat.com.weatherapp.model.Location;

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
}

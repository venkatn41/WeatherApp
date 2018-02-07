package venkat.com.weatherapp.model.Location;

public class StationItem{
	private String country;
	private int distanceKm;
	private String city;
	private int distanceMi;
	private double lon;
	private String neighborhood;
	private String state;
	private String id;
	private double lat;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setDistanceKm(int distanceKm){
		this.distanceKm = distanceKm;
	}

	public int getDistanceKm(){
		return distanceKm;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setDistanceMi(int distanceMi){
		this.distanceMi = distanceMi;
	}

	public int getDistanceMi(){
		return distanceMi;
	}

	public void setLon(double lon){
		this.lon = lon;
	}

	public double getLon(){
		return lon;
	}

	public void setNeighborhood(String neighborhood){
		this.neighborhood = neighborhood;
	}

	public String getNeighborhood(){
		return neighborhood;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setLat(double lat){
		this.lat = lat;
	}

	public double getLat(){
		return lat;
	}
}

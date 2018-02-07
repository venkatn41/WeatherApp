package venkat.com.weatherapp.model.forecast;

public class ObservationLocation{
	private String elevation;
	private String country;
	private String countryIso3166;
	private String city;
	private String latitude;
	private String state;
	private String full;
	private String longitude;

	public void setElevation(String elevation){
		this.elevation = elevation;
	}

	public String getElevation(){
		return elevation;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setCountryIso3166(String countryIso3166){
		this.countryIso3166 = countryIso3166;
	}

	public String getCountryIso3166(){
		return countryIso3166;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setFull(String full){
		this.full = full;
	}

	public String getFull(){
		return full;
	}

	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	public String getLongitude(){
		return longitude;
	}

	@Override
 	public String toString(){
		return 
			"ObservationLocation{" + 
			"elevation = '" + elevation + '\'' + 
			",country = '" + country + '\'' + 
			",country_iso3166 = '" + countryIso3166 + '\'' + 
			",city = '" + city + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",state = '" + state + '\'' + 
			",full = '" + full + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}

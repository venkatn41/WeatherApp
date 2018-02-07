package venkat.com.weatherapp.model.forecast;

public class DisplayLocation{
	private String zip;
	private String magic;
	private String elevation;
	private String country;
	private String countryIso3166;
	private String city;
	private String stateName;
	private String latitude;
	private String wmo;
	private String state;
	private String full;
	private String longitude;

	public void setZip(String zip){
		this.zip = zip;
	}

	public String getZip(){
		return zip;
	}

	public void setMagic(String magic){
		this.magic = magic;
	}

	public String getMagic(){
		return magic;
	}

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

	public void setStateName(String stateName){
		this.stateName = stateName;
	}

	public String getStateName(){
		return stateName;
	}

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setWmo(String wmo){
		this.wmo = wmo;
	}

	public String getWmo(){
		return wmo;
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
			"DisplayLocation{" + 
			"zip = '" + zip + '\'' + 
			",magic = '" + magic + '\'' + 
			",elevation = '" + elevation + '\'' + 
			",country = '" + country + '\'' + 
			",country_iso3166 = '" + countryIso3166 + '\'' + 
			",city = '" + city + '\'' + 
			",state_name = '" + stateName + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",wmo = '" + wmo + '\'' + 
			",state = '" + state + '\'' + 
			",full = '" + full + '\'' + 
			",longitude = '" + longitude + '\'' + 
			"}";
		}
}

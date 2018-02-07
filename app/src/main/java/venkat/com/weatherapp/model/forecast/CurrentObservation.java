package venkat.com.weatherapp.model.forecast;

import com.google.gson.annotations.SerializedName;

public class CurrentObservation{
	private String nowcast;
	private double tempC;
	private String observationEpoch;
	private double tempF;
	private int windKph;
	private int windMph;
	private int windDegrees;

	@SerializedName("temperature_string")
	private String temperatureString;
	private String weather;
	private String feelslikeString;
	private String precipTodayMetric;
	private String precip1hrString;
	private String iconUrl;
	private Image image;
	private String uV;
	private String stationId;
	private String localEpoch;
	private String localTzShort;
	private String windDir;
	private String precip1hrMetric;
	private String pressureIn;
	private String localTzLong;
	private String windGustMph;
	private String windchillString;
	private String windGustKph;
	private String windString;
	private String localTimeRfc822;
	private String visibilityKm;
	private String relativeHumidity;
	private String pressureMb;
	private String observationTimeRfc822;
	private String precip1hrIn;
	private String feelslikeC;
	private String observationTime;
	private String feelslikeF;
	private String historyUrl;
	private String windchillF;
	private String windchillC;
	private String precipTodayString;
	private String icon;
	private String precipTodayIn;
	private String solarradiation;

	@SerializedName("observation_location")
	private ObservationLocation observationLocation;
	private int dewpointF;

	@SerializedName("display_location")
	private DisplayLocation displayLocation;
	private String dewpointString;
	private String pressureTrend;
	private int dewpointC;
	private Estimated estimated;
	private String forecastUrl;
	private String localTzOffset;
	private String heatIndexF;
	private String heatIndexC;
	private String obUrl;
	private String heatIndexString;
	private String visibilityMi;

	public void setNowcast(String nowcast){
		this.nowcast = nowcast;
	}

	public String getNowcast(){
		return nowcast;
	}

	public void setTempC(double tempC){
		this.tempC = tempC;
	}

	public double getTempC(){
		return tempC;
	}

	public void setObservationEpoch(String observationEpoch){
		this.observationEpoch = observationEpoch;
	}

	public String getObservationEpoch(){
		return observationEpoch;
	}

	public void setTempF(double tempF){
		this.tempF = tempF;
	}

	public double getTempF(){
		return tempF;
	}

	public void setWindKph(int windKph){
		this.windKph = windKph;
	}

	public int getWindKph(){
		return windKph;
	}

	public void setWindMph(int windMph){
		this.windMph = windMph;
	}

	public int getWindMph(){
		return windMph;
	}

	public void setWindDegrees(int windDegrees){
		this.windDegrees = windDegrees;
	}

	public int getWindDegrees(){
		return windDegrees;
	}

	public void setTemperatureString(String temperatureString){
		this.temperatureString = temperatureString;
	}

	public String getTemperatureString(){
		return temperatureString;
	}

	public void setWeather(String weather){
		this.weather = weather;
	}

	public String getWeather(){
		return weather;
	}

	public void setFeelslikeString(String feelslikeString){
		this.feelslikeString = feelslikeString;
	}

	public String getFeelslikeString(){
		return feelslikeString;
	}

	public void setPrecipTodayMetric(String precipTodayMetric){
		this.precipTodayMetric = precipTodayMetric;
	}

	public String getPrecipTodayMetric(){
		return precipTodayMetric;
	}

	public void setPrecip1hrString(String precip1hrString){
		this.precip1hrString = precip1hrString;
	}

	public String getPrecip1hrString(){
		return precip1hrString;
	}

	public void setIconUrl(String iconUrl){
		this.iconUrl = iconUrl;
	}

	public String getIconUrl(){
		return iconUrl;
	}

	public void setImage(Image image){
		this.image = image;
	}

	public Image getImage(){
		return image;
	}

	public void setUV(String uV){
		this.uV = uV;
	}

	public String getUV(){
		return uV;
	}

	public void setStationId(String stationId){
		this.stationId = stationId;
	}

	public String getStationId(){
		return stationId;
	}

	public void setLocalEpoch(String localEpoch){
		this.localEpoch = localEpoch;
	}

	public String getLocalEpoch(){
		return localEpoch;
	}

	public void setLocalTzShort(String localTzShort){
		this.localTzShort = localTzShort;
	}

	public String getLocalTzShort(){
		return localTzShort;
	}

	public void setWindDir(String windDir){
		this.windDir = windDir;
	}

	public String getWindDir(){
		return windDir;
	}

	public void setPrecip1hrMetric(String precip1hrMetric){
		this.precip1hrMetric = precip1hrMetric;
	}

	public String getPrecip1hrMetric(){
		return precip1hrMetric;
	}

	public void setPressureIn(String pressureIn){
		this.pressureIn = pressureIn;
	}

	public String getPressureIn(){
		return pressureIn;
	}

	public void setLocalTzLong(String localTzLong){
		this.localTzLong = localTzLong;
	}

	public String getLocalTzLong(){
		return localTzLong;
	}

	public void setWindGustMph(String windGustMph){
		this.windGustMph = windGustMph;
	}

	public String getWindGustMph(){
		return windGustMph;
	}

	public void setWindchillString(String windchillString){
		this.windchillString = windchillString;
	}

	public String getWindchillString(){
		return windchillString;
	}

	public void setWindGustKph(String windGustKph){
		this.windGustKph = windGustKph;
	}

	public String getWindGustKph(){
		return windGustKph;
	}

	public void setWindString(String windString){
		this.windString = windString;
	}

	public String getWindString(){
		return windString;
	}

	public void setLocalTimeRfc822(String localTimeRfc822){
		this.localTimeRfc822 = localTimeRfc822;
	}

	public String getLocalTimeRfc822(){
		return localTimeRfc822;
	}

	public void setVisibilityKm(String visibilityKm){
		this.visibilityKm = visibilityKm;
	}

	public String getVisibilityKm(){
		return visibilityKm;
	}

	public void setRelativeHumidity(String relativeHumidity){
		this.relativeHumidity = relativeHumidity;
	}

	public String getRelativeHumidity(){
		return relativeHumidity;
	}

	public void setPressureMb(String pressureMb){
		this.pressureMb = pressureMb;
	}

	public String getPressureMb(){
		return pressureMb;
	}

	public void setObservationTimeRfc822(String observationTimeRfc822){
		this.observationTimeRfc822 = observationTimeRfc822;
	}

	public String getObservationTimeRfc822(){
		return observationTimeRfc822;
	}

	public void setPrecip1hrIn(String precip1hrIn){
		this.precip1hrIn = precip1hrIn;
	}

	public String getPrecip1hrIn(){
		return precip1hrIn;
	}

	public void setFeelslikeC(String feelslikeC){
		this.feelslikeC = feelslikeC;
	}

	public String getFeelslikeC(){
		return feelslikeC;
	}

	public void setObservationTime(String observationTime){
		this.observationTime = observationTime;
	}

	public String getObservationTime(){
		return observationTime;
	}

	public void setFeelslikeF(String feelslikeF){
		this.feelslikeF = feelslikeF;
	}

	public String getFeelslikeF(){
		return feelslikeF;
	}

	public void setHistoryUrl(String historyUrl){
		this.historyUrl = historyUrl;
	}

	public String getHistoryUrl(){
		return historyUrl;
	}

	public void setWindchillF(String windchillF){
		this.windchillF = windchillF;
	}

	public String getWindchillF(){
		return windchillF;
	}

	public void setWindchillC(String windchillC){
		this.windchillC = windchillC;
	}

	public String getWindchillC(){
		return windchillC;
	}

	public void setPrecipTodayString(String precipTodayString){
		this.precipTodayString = precipTodayString;
	}

	public String getPrecipTodayString(){
		return precipTodayString;
	}

	public void setIcon(String icon){
		this.icon = icon;
	}

	public String getIcon(){
		return icon;
	}

	public void setPrecipTodayIn(String precipTodayIn){
		this.precipTodayIn = precipTodayIn;
	}

	public String getPrecipTodayIn(){
		return precipTodayIn;
	}

	public void setSolarradiation(String solarradiation){
		this.solarradiation = solarradiation;
	}

	public String getSolarradiation(){
		return solarradiation;
	}

	public void setObservationLocation(ObservationLocation observationLocation){
		this.observationLocation = observationLocation;
	}

	public ObservationLocation getObservationLocation(){
		return observationLocation;
	}

	public void setDewpointF(int dewpointF){
		this.dewpointF = dewpointF;
	}

	public int getDewpointF(){
		return dewpointF;
	}

	public void setDisplayLocation(DisplayLocation displayLocation){
		this.displayLocation = displayLocation;
	}

	public DisplayLocation getDisplayLocation(){
		return displayLocation;
	}

	public void setDewpointString(String dewpointString){
		this.dewpointString = dewpointString;
	}

	public String getDewpointString(){
		return dewpointString;
	}

	public void setPressureTrend(String pressureTrend){
		this.pressureTrend = pressureTrend;
	}

	public String getPressureTrend(){
		return pressureTrend;
	}

	public void setDewpointC(int dewpointC){
		this.dewpointC = dewpointC;
	}

	public int getDewpointC(){
		return dewpointC;
	}

	public void setEstimated(Estimated estimated){
		this.estimated = estimated;
	}

	public Estimated getEstimated(){
		return estimated;
	}

	public void setForecastUrl(String forecastUrl){
		this.forecastUrl = forecastUrl;
	}

	public String getForecastUrl(){
		return forecastUrl;
	}

	public void setLocalTzOffset(String localTzOffset){
		this.localTzOffset = localTzOffset;
	}

	public String getLocalTzOffset(){
		return localTzOffset;
	}

	public void setHeatIndexF(String heatIndexF){
		this.heatIndexF = heatIndexF;
	}

	public String getHeatIndexF(){
		return heatIndexF;
	}

	public void setHeatIndexC(String heatIndexC){
		this.heatIndexC = heatIndexC;
	}

	public String getHeatIndexC(){
		return heatIndexC;
	}

	public void setObUrl(String obUrl){
		this.obUrl = obUrl;
	}

	public String getObUrl(){
		return obUrl;
	}

	public void setHeatIndexString(String heatIndexString){
		this.heatIndexString = heatIndexString;
	}

	public String getHeatIndexString(){
		return heatIndexString;
	}

	public void setVisibilityMi(String visibilityMi){
		this.visibilityMi = visibilityMi;
	}

	public String getVisibilityMi(){
		return visibilityMi;
	}

	@Override
 	public String toString(){
		return 
			"CurrentObservation{" + 
			"nowcast = '" + nowcast + '\'' + 
			",temp_c = '" + tempC + '\'' + 
			",observation_epoch = '" + observationEpoch + '\'' + 
			",temp_f = '" + tempF + '\'' + 
			",wind_kph = '" + windKph + '\'' + 
			",wind_mph = '" + windMph + '\'' + 
			",wind_degrees = '" + windDegrees + '\'' + 
			",temperature_string = '" + temperatureString + '\'' + 
			",weather = '" + weather + '\'' + 
			",feelslike_string = '" + feelslikeString + '\'' + 
			",precip_today_metric = '" + precipTodayMetric + '\'' + 
			",precip_1hr_string = '" + precip1hrString + '\'' + 
			",icon_url = '" + iconUrl + '\'' + 
			",image = '" + image + '\'' + 
			",uV = '" + uV + '\'' + 
			",station_id = '" + stationId + '\'' + 
			",local_epoch = '" + localEpoch + '\'' + 
			",local_tz_short = '" + localTzShort + '\'' + 
			",wind_dir = '" + windDir + '\'' + 
			",precip_1hr_metric = '" + precip1hrMetric + '\'' + 
			",pressure_in = '" + pressureIn + '\'' + 
			",local_tz_long = '" + localTzLong + '\'' + 
			",wind_gust_mph = '" + windGustMph + '\'' + 
			",windchill_string = '" + windchillString + '\'' + 
			",wind_gust_kph = '" + windGustKph + '\'' + 
			",wind_string = '" + windString + '\'' + 
			",local_time_rfc822 = '" + localTimeRfc822 + '\'' + 
			",visibility_km = '" + visibilityKm + '\'' + 
			",relative_humidity = '" + relativeHumidity + '\'' + 
			",pressure_mb = '" + pressureMb + '\'' + 
			",observation_time_rfc822 = '" + observationTimeRfc822 + '\'' + 
			",precip_1hr_in = '" + precip1hrIn + '\'' + 
			",feelslike_c = '" + feelslikeC + '\'' + 
			",observation_time = '" + observationTime + '\'' + 
			",feelslike_f = '" + feelslikeF + '\'' + 
			",history_url = '" + historyUrl + '\'' + 
			",windchill_f = '" + windchillF + '\'' + 
			",windchill_c = '" + windchillC + '\'' + 
			",precip_today_string = '" + precipTodayString + '\'' + 
			",icon = '" + icon + '\'' + 
			",precip_today_in = '" + precipTodayIn + '\'' + 
			",solarradiation = '" + solarradiation + '\'' + 
			",observation_location = '" + observationLocation + '\'' + 
			",dewpoint_f = '" + dewpointF + '\'' + 
			",display_location = '" + displayLocation + '\'' + 
			",dewpoint_string = '" + dewpointString + '\'' + 
			",pressure_trend = '" + pressureTrend + '\'' + 
			",dewpoint_c = '" + dewpointC + '\'' + 
			",estimated = '" + estimated + '\'' + 
			",forecast_url = '" + forecastUrl + '\'' + 
			",local_tz_offset = '" + localTzOffset + '\'' + 
			",heat_index_f = '" + heatIndexF + '\'' + 
			",heat_index_c = '" + heatIndexC + '\'' + 
			",ob_url = '" + obUrl + '\'' + 
			",heat_index_string = '" + heatIndexString + '\'' + 
			",visibility_mi = '" + visibilityMi + '\'' + 
			"}";
		}
}

package venkat.com.weatherapp.model.hourly;

import com.google.gson.annotations.SerializedName;

public class HourlyForecastItem{
	private String iconUrl;
	private String sky;
	private Wdir wdir;
	private String wx;
	private Temp temp;
	private Dewpoint dewpoint;
	private Feelslike feelslike;
	private Qpf qpf;
	private Wspd wspd;
	private String icon;
	private String uvi;

	@SerializedName("FCTTIME")
	private FCTTIME fCTTIME;
	private Heatindex heatindex;
	private String pop;
	private String condition;
	private Snow snow;
	private String fctcode;
	private String humidity;
	private Mslp mslp;
	private Windchill windchill;

	public void setIconUrl(String iconUrl){
		this.iconUrl = iconUrl;
	}

	public String getIconUrl(){
		return iconUrl;
	}

	public void setSky(String sky){
		this.sky = sky;
	}

	public String getSky(){
		return sky;
	}

	public void setWdir(Wdir wdir){
		this.wdir = wdir;
	}

	public Wdir getWdir(){
		return wdir;
	}

	public void setWx(String wx){
		this.wx = wx;
	}

	public String getWx(){
		return wx;
	}

	public void setTemp(Temp temp){
		this.temp = temp;
	}

	public Temp getTemp(){
		return temp;
	}

	public void setDewpoint(Dewpoint dewpoint){
		this.dewpoint = dewpoint;
	}

	public Dewpoint getDewpoint(){
		return dewpoint;
	}

	public void setFeelslike(Feelslike feelslike){
		this.feelslike = feelslike;
	}

	public Feelslike getFeelslike(){
		return feelslike;
	}

	public void setQpf(Qpf qpf){
		this.qpf = qpf;
	}

	public Qpf getQpf(){
		return qpf;
	}

	public void setWspd(Wspd wspd){
		this.wspd = wspd;
	}

	public Wspd getWspd(){
		return wspd;
	}

	public void setIcon(String icon){
		this.icon = icon;
	}

	public String getIcon(){
		return icon;
	}

	public void setUvi(String uvi){
		this.uvi = uvi;
	}

	public String getUvi(){
		return uvi;
	}

	public void setFCTTIME(FCTTIME fCTTIME){
		this.fCTTIME = fCTTIME;
	}

	public FCTTIME getFCTTIME(){
		return fCTTIME;
	}

	public void setHeatindex(Heatindex heatindex){
		this.heatindex = heatindex;
	}

	public Heatindex getHeatindex(){
		return heatindex;
	}

	public void setPop(String pop){
		this.pop = pop;
	}

	public String getPop(){
		return pop;
	}

	public void setCondition(String condition){
		this.condition = condition;
	}

	public String getCondition(){
		return condition;
	}

	public void setSnow(Snow snow){
		this.snow = snow;
	}

	public Snow getSnow(){
		return snow;
	}

	public void setFctcode(String fctcode){
		this.fctcode = fctcode;
	}

	public String getFctcode(){
		return fctcode;
	}

	public void setHumidity(String humidity){
		this.humidity = humidity;
	}

	public String getHumidity(){
		return humidity;
	}

	public void setMslp(Mslp mslp){
		this.mslp = mslp;
	}

	public Mslp getMslp(){
		return mslp;
	}

	public void setWindchill(Windchill windchill){
		this.windchill = windchill;
	}

	public Windchill getWindchill(){
		return windchill;
	}

	@Override
 	public String toString(){
		return 
			"HourlyForecastItem{" + 
			"icon_url = '" + iconUrl + '\'' + 
			",sky = '" + sky + '\'' + 
			",wdir = '" + wdir + '\'' + 
			",wx = '" + wx + '\'' + 
			",temp = '" + temp + '\'' + 
			",dewpoint = '" + dewpoint + '\'' + 
			",feelslike = '" + feelslike + '\'' + 
			",qpf = '" + qpf + '\'' + 
			",wspd = '" + wspd + '\'' + 
			",icon = '" + icon + '\'' + 
			",uvi = '" + uvi + '\'' + 
			",fCTTIME = '" + fCTTIME + '\'' + 
			",heatindex = '" + heatindex + '\'' + 
			",pop = '" + pop + '\'' + 
			",condition = '" + condition + '\'' + 
			",snow = '" + snow + '\'' + 
			",fctcode = '" + fctcode + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",mslp = '" + mslp + '\'' + 
			",windchill = '" + windchill + '\'' + 
			"}";
		}
}

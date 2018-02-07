package venkat.com.weatherapp.model.hourly;

public class FCTTIME{
	private String mdayPadded;
	private String monthName;
	private String weekdayNameNightUnlang;
	private String ampm;
	private String year;
	private String tz;
	private String epoch;
	private String monthNameAbbrev;
	private String weekdayNameAbbrev;
	private String mon;
	private String monAbbrev;
	private String sec;
	private String min;
	private String hour;
	private String minUnpadded;
	private String civil;
	private String weekdayNameNight;
	private String pretty;
	private String monPadded;
	private String weekdayNameUnlang;
	private String isdst;
	private String hourPadded;
	private String uTCDATE;
	private String yday;
	private String mday;
	private String weekdayName;
	private String age;

	public void setMdayPadded(String mdayPadded){
		this.mdayPadded = mdayPadded;
	}

	public String getMdayPadded(){
		return mdayPadded;
	}

	public void setMonthName(String monthName){
		this.monthName = monthName;
	}

	public String getMonthName(){
		return monthName;
	}

	public void setWeekdayNameNightUnlang(String weekdayNameNightUnlang){
		this.weekdayNameNightUnlang = weekdayNameNightUnlang;
	}

	public String getWeekdayNameNightUnlang(){
		return weekdayNameNightUnlang;
	}

	public void setAmpm(String ampm){
		this.ampm = ampm;
	}

	public String getAmpm(){
		return ampm;
	}

	public void setYear(String year){
		this.year = year;
	}

	public String getYear(){
		return year;
	}

	public void setTz(String tz){
		this.tz = tz;
	}

	public String getTz(){
		return tz;
	}

	public void setEpoch(String epoch){
		this.epoch = epoch;
	}

	public String getEpoch(){
		return epoch;
	}

	public void setMonthNameAbbrev(String monthNameAbbrev){
		this.monthNameAbbrev = monthNameAbbrev;
	}

	public String getMonthNameAbbrev(){
		return monthNameAbbrev;
	}

	public void setWeekdayNameAbbrev(String weekdayNameAbbrev){
		this.weekdayNameAbbrev = weekdayNameAbbrev;
	}

	public String getWeekdayNameAbbrev(){
		return weekdayNameAbbrev;
	}

	public void setMon(String mon){
		this.mon = mon;
	}

	public String getMon(){
		return mon;
	}

	public void setMonAbbrev(String monAbbrev){
		this.monAbbrev = monAbbrev;
	}

	public String getMonAbbrev(){
		return monAbbrev;
	}

	public void setSec(String sec){
		this.sec = sec;
	}

	public String getSec(){
		return sec;
	}

	public void setMin(String min){
		this.min = min;
	}

	public String getMin(){
		return min;
	}

	public void setHour(String hour){
		this.hour = hour;
	}

	public String getHour(){
		return hour;
	}

	public void setMinUnpadded(String minUnpadded){
		this.minUnpadded = minUnpadded;
	}

	public String getMinUnpadded(){
		return minUnpadded;
	}

	public void setCivil(String civil){
		this.civil = civil;
	}

	public String getCivil(){
		return civil;
	}

	public void setWeekdayNameNight(String weekdayNameNight){
		this.weekdayNameNight = weekdayNameNight;
	}

	public String getWeekdayNameNight(){
		return weekdayNameNight;
	}

	public void setPretty(String pretty){
		this.pretty = pretty;
	}

	public String getPretty(){
		return pretty;
	}

	public void setMonPadded(String monPadded){
		this.monPadded = monPadded;
	}

	public String getMonPadded(){
		return monPadded;
	}

	public void setWeekdayNameUnlang(String weekdayNameUnlang){
		this.weekdayNameUnlang = weekdayNameUnlang;
	}

	public String getWeekdayNameUnlang(){
		return weekdayNameUnlang;
	}

	public void setIsdst(String isdst){
		this.isdst = isdst;
	}

	public String getIsdst(){
		return isdst;
	}

	public void setHourPadded(String hourPadded){
		this.hourPadded = hourPadded;
	}

	public String getHourPadded(){
		return hourPadded;
	}

	public void setUTCDATE(String uTCDATE){
		this.uTCDATE = uTCDATE;
	}

	public String getUTCDATE(){
		return uTCDATE;
	}

	public void setYday(String yday){
		this.yday = yday;
	}

	public String getYday(){
		return yday;
	}

	public void setMday(String mday){
		this.mday = mday;
	}

	public String getMday(){
		return mday;
	}

	public void setWeekdayName(String weekdayName){
		this.weekdayName = weekdayName;
	}

	public String getWeekdayName(){
		return weekdayName;
	}

	public void setAge(String age){
		this.age = age;
	}

	public String getAge(){
		return age;
	}

	@Override
 	public String toString(){
		return "Time :"+getHour();
		}
}

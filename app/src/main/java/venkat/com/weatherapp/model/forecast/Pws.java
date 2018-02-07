package venkat.com.weatherapp.model.forecast;

import java.util.List;

public class Pws{
	private List<StationItem> station;

	public void setStation(List<StationItem> station){
		this.station = station;
	}

	public List<StationItem> getStation(){
		return station;
	}

	@Override
 	public String toString(){
		return 
			"Pws{" + 
			"station = '" + station + '\'' + 
			"}";
		}
}
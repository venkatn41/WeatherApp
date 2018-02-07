package venkat.com.weatherapp.model.Location;

import java.util.List;

public class Airport{
	private List<StationItem> station;

	public void setStation(List<StationItem> station){
		this.station = station;
	}

	public List<StationItem> getStation(){
		return station;
	}
}
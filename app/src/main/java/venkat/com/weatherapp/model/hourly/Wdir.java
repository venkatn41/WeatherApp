package venkat.com.weatherapp.model.hourly;

public class Wdir{
	private String dir;
	private String degrees;

	public void setDir(String dir){
		this.dir = dir;
	}

	public String getDir(){
		return dir;
	}

	public void setDegrees(String degrees){
		this.degrees = degrees;
	}

	public String getDegrees(){
		return degrees;
	}

	@Override
 	public String toString(){
		return 
			"Wdir{" + 
			"dir = '" + dir + '\'' + 
			",degrees = '" + degrees + '\'' + 
			"}";
		}
}

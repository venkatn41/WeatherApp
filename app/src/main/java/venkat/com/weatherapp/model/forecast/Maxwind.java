package venkat.com.weatherapp.model.forecast;

public class Maxwind{
	private int kph;
	private int mph;
	private String dir;
	private int degrees;

	public void setKph(int kph){
		this.kph = kph;
	}

	public int getKph(){
		return kph;
	}

	public void setMph(int mph){
		this.mph = mph;
	}

	public int getMph(){
		return mph;
	}

	public void setDir(String dir){
		this.dir = dir;
	}

	public String getDir(){
		return dir;
	}

	public void setDegrees(int degrees){
		this.degrees = degrees;
	}

	public int getDegrees(){
		return degrees;
	}

	@Override
 	public String toString(){
		return 
			"Maxwind{" + 
			"kph = '" + kph + '\'' + 
			",mph = '" + mph + '\'' + 
			",dir = '" + dir + '\'' + 
			",degrees = '" + degrees + '\'' + 
			"}";
		}
}

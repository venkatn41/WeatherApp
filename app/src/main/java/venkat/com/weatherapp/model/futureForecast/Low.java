package venkat.com.weatherapp.model.futureForecast;

public class Low{
	private String celsius;
	private String fahrenheit;

	public void setCelsius(String celsius){
		this.celsius = celsius;
	}

	public String getCelsius(){
		return celsius;
	}

	public void setFahrenheit(String fahrenheit){
		this.fahrenheit = fahrenheit;
	}

	public String getFahrenheit(){
		return fahrenheit;
	}

	@Override
 	public String toString() {
		return "Low :" + getFahrenheit() +" F";
	}
}

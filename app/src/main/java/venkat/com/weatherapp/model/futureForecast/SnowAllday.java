package venkat.com.weatherapp.model.futureForecast;

public class SnowAllday{
	private int in;
	private int cm;

	public void setIn(int in){
		this.in = in;
	}

	public int getIn(){
		return in;
	}

	public void setCm(int cm){
		this.cm = cm;
	}

	public int getCm(){
		return cm;
	}

	@Override
 	public String toString(){
		return 
			"SnowAllday{" + 
			"in = '" + in + '\'' + 
			",cm = '" + cm + '\'' + 
			"}";
		}
}

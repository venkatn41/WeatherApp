package venkat.com.weatherapp.model.forecast;

public class SnowDay{
	private Object in;
	private Object cm;

	public void setIn(Object in){
		this.in = in;
	}

	public Object getIn(){
		return in;
	}

	public void setCm(Object cm){
		this.cm = cm;
	}

	public Object getCm(){
		return cm;
	}

	@Override
 	public String toString(){
		return 
			"SnowDay{" + 
			"in = '" + in + '\'' + 
			",cm = '" + cm + '\'' + 
			"}";
		}
}

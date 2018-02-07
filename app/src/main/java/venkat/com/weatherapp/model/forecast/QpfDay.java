package venkat.com.weatherapp.model.forecast;

public class QpfDay{
	private Object mm;
	private Object in;

	public void setMm(Object mm){
		this.mm = mm;
	}

	public Object getMm(){
		return mm;
	}

	public void setIn(Object in){
		this.in = in;
	}

	public Object getIn(){
		return in;
	}

	@Override
 	public String toString(){
		return 
			"QpfDay{" + 
			"mm = '" + mm + '\'' + 
			",in = '" + in + '\'' + 
			"}";
		}
}

package venkat.com.weatherapp.model.forecast;

public class QpfAllday{
	private int mm;
	private int in;

	public void setMm(int mm){
		this.mm = mm;
	}

	public int getMm(){
		return mm;
	}

	public void setIn(int in){
		this.in = in;
	}

	public int getIn(){
		return in;
	}

	@Override
 	public String toString(){
		return 
			"QpfAllday{" + 
			"mm = '" + mm + '\'' + 
			",in = '" + in + '\'' + 
			"}";
		}
}

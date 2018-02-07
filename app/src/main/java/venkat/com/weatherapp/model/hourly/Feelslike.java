package venkat.com.weatherapp.model.hourly;

public class Feelslike{
	private String metric;
	private String english;

	public void setMetric(String metric){
		this.metric = metric;
	}

	public String getMetric(){
		return metric;
	}

	public void setEnglish(String english){
		this.english = english;
	}

	public String getEnglish(){
		return english;
	}

	@Override
 	public String toString(){
		return 
			"Feelslike{" + 
			"metric = '" + metric + '\'' + 
			",english = '" + english + '\'' + 
			"}";
		}
}

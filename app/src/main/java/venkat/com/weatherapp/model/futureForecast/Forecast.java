package venkat.com.weatherapp.model.futureForecast;

public class Forecast{
	private Simpleforecast simpleforecast;
	private TxtForecast txtForecast;

	public void setSimpleforecast(Simpleforecast simpleforecast){
		this.simpleforecast = simpleforecast;
	}

	public Simpleforecast getSimpleforecast(){
		return simpleforecast;
	}

	public void setTxtForecast(TxtForecast txtForecast){
		this.txtForecast = txtForecast;
	}

	public TxtForecast getTxtForecast(){
		return txtForecast;
	}

	@Override
 	public String toString(){
		return 
			"Forecast{" + 
			"simpleforecast = '" + simpleforecast + '\'' + 
			",txt_forecast = '" + txtForecast + '\'' + 
			"}";
		}
}

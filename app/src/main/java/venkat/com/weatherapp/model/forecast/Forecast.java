package venkat.com.weatherapp.model.forecast;

import com.google.gson.annotations.SerializedName;

public class Forecast{
	private Simpleforecast simpleforecast;

	@SerializedName("txt_forecast")
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

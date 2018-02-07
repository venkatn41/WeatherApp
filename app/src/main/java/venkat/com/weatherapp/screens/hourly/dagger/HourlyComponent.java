package venkat.com.weatherapp.screens.hourly.dagger;

import dagger.Component;
import venkat.com.weatherapp.application.builder.AppComponent;
import venkat.com.weatherapp.screens.hourly.HourlyForecastListActivity;

/**
 * Created by venkat on 2/3/18.
 */
@HourlyScope
@Component(dependencies = {AppComponent.class}, modules = {HourlyModule.class})
public interface HourlyComponent {
    void inject(HourlyForecastListActivity activity);
}

package venkat.com.weatherapp.screens.future.dagger;

import dagger.Component;
import venkat.com.weatherapp.application.builder.AppComponent;
import venkat.com.weatherapp.screens.future.FutureForecastListActivity;


/**
 * Created by venkat on 2/3/18.
 */

@FutureScope
@Component(dependencies = {AppComponent.class} , modules = {FutureModule.class})
public interface FutureComponent {
    void inject (FutureForecastListActivity activity);
}

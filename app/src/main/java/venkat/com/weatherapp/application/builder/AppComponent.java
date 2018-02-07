package venkat.com.weatherapp.application.builder;

import dagger.Component;
import venkat.com.weatherapp.api.WeatherApi;
import venkat.com.weatherapp.utils.rx.RxSchedulers;

/**
 * Created by venkat on 2/3/18.
 */

@AppScope
@Component(modules = {NetworkModule.class, AppContextModule.class, WeatherApiServiceModule.class, RxModule.class})
public interface AppComponent {

    RxSchedulers rxSchedulers();
    WeatherApi apiService();
}

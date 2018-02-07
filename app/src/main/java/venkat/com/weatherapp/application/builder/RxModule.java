package venkat.com.weatherapp.application.builder;

import dagger.Module;
import dagger.Provides;
import venkat.com.weatherapp.utils.rx.AppRxSchedulers;
import venkat.com.weatherapp.utils.rx.RxSchedulers;

/**
 * Created by venkat on 2/3/18.
 */

@Module
public class RxModule {

    @Provides
    RxSchedulers provideRxSchedulers() {
        return new AppRxSchedulers();
    }
}

package venkat.com.weatherapp.screens.hourly.dagger;

import dagger.Module;
import dagger.Provides;
import rx.subscriptions.CompositeSubscription;
import venkat.com.weatherapp.api.WeatherApi;
import venkat.com.weatherapp.screens.hourly.HourlyForecastListActivity;
import venkat.com.weatherapp.screens.hourly.core.HourlyModel;
import venkat.com.weatherapp.screens.hourly.core.HourlyPresenter;
import venkat.com.weatherapp.screens.hourly.core.HourlyView;
import venkat.com.weatherapp.utils.rx.RxSchedulers;

/**
 * Created by venkat on 2/3/18.
 */
@Module
public class HourlyModule {

    HourlyForecastListActivity context;

    public HourlyModule(HourlyForecastListActivity context) {
        this.context = context;
    }

    @HourlyScope
    @Provides
    HourlyView providesView() {
        return new HourlyView(context);
    }

    @HourlyScope
    @Provides
    HourlyPresenter providesPresenter(HourlyView view, HourlyModel model, RxSchedulers schduler) {
        CompositeSubscription subscription = new CompositeSubscription();
        return new HourlyPresenter(view, model,schduler,subscription);
    }

    @HourlyScope
    @Provides
    HourlyForecastListActivity provideContext(){
        return context;
    }

    @HourlyScope
    @Provides
    HourlyModel provideModel(WeatherApi api) {
        return new HourlyModel(context,api);
    }
}

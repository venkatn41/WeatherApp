package venkat.com.weatherapp.screens.main.dagger;

import dagger.Module;
import dagger.Provides;
import rx.subscriptions.CompositeSubscription;
import venkat.com.weatherapp.api.WeatherApi;
import venkat.com.weatherapp.screens.main.MainActivity;
import venkat.com.weatherapp.screens.main.core.MainModel;
import venkat.com.weatherapp.screens.main.core.MainPresenter;
import venkat.com.weatherapp.screens.main.core.MainView;
import venkat.com.weatherapp.utils.rx.RxSchedulers;

/**
 * Created by venkat on 2/3/18.
 */

@Module
public class MainModule {
    MainActivity activityContext;

    public MainModule(MainActivity activity) {
        activityContext = activity;
    }

    @MainScope
    @Provides
    MainView provideView() {
        return new MainView(activityContext);
    }

    @MainScope
    @Provides
    MainPresenter providesPresenter(MainView view, RxSchedulers schedulers, MainModel model) {
        CompositeSubscription subscriptions = new CompositeSubscription();
        return new MainPresenter(view, model, schedulers, subscriptions);
    }

    @MainScope
    @Provides
    MainActivity providesContext() {
        return activityContext;
    }

    @MainScope
    @Provides
    MainModel provideModel(WeatherApi api) {
        return new MainModel(activityContext, api);
    }
}

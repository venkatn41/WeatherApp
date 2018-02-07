package venkat.com.weatherapp.screens.future.dagger;

import dagger.Module;
import dagger.Provides;
import rx.subscriptions.CompositeSubscription;
import venkat.com.weatherapp.api.WeatherApi;
import venkat.com.weatherapp.screens.future.FutureForecastListActivity;
import venkat.com.weatherapp.screens.future.core.FutureModel;
import venkat.com.weatherapp.screens.future.core.FuturePresenter;
import venkat.com.weatherapp.screens.future.core.FutureView;
import venkat.com.weatherapp.utils.rx.RxSchedulers;

/**
 * Created by venkat on 2/3/18.
 */

@Module
public class FutureModule {

    FutureForecastListActivity context;

    public FutureModule(FutureForecastListActivity context) {
        this.context = context;
    }

    @FutureScope
    @Provides
    FutureView provideView() {
        return new FutureView(context);
    }

    @FutureScope
    @Provides
    FuturePresenter providePresenter(FutureView view, FutureModel model, RxSchedulers scheduler) {
        CompositeSubscription subscriptions = new CompositeSubscription();
        return new FuturePresenter(view, model, scheduler, subscriptions);
    }

    @FutureScope
    @Provides
    FutureForecastListActivity providesContext() {
        return context;
    }

    @FutureScope
    @Provides
    FutureModel provideModel(WeatherApi api) {
        return new FutureModel(context, api);
    }
}

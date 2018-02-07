package venkat.com.weatherapp.application.builder;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by venkat on 2/3/18.
 */

@Module
public class AppContextModule {

    private final Context context;

    public AppContextModule(Context aContext) {
        this.context = aContext;
    }

    @AppScope
    @Provides
    Context provideAppContext() {
        return context;
    }

}

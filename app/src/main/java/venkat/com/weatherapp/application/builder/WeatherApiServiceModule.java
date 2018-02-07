package venkat.com.weatherapp.application.builder;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import venkat.com.weatherapp.api.WeatherApi;

/**
 * Created by venkat on 2/3/18.
 */

@Module
public class WeatherApiServiceModule {

    private static final String BASE_URL = "http://api.wunderground.com/api/";

    @AppScope
    @Provides
    WeatherApi provideApiService(OkHttpClient client, GsonConverterFactory gson, RxJavaCallAdapterFactory rxAdapter)
    {
        Retrofit retrofit =   new Retrofit.Builder().client(client)
                .baseUrl(BASE_URL).addConverterFactory(gson).
                        addCallAdapterFactory(rxAdapter).build();

        return  retrofit.create(WeatherApi.class);
    }
}

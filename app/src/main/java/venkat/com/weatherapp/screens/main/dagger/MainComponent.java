package venkat.com.weatherapp.screens.main.dagger;

import dagger.Component;
import venkat.com.weatherapp.application.builder.AppComponent;
import venkat.com.weatherapp.screens.main.MainActivity;

/**
 * Created by venkat on 2/3/18.
 */

@MainScope
@Component(dependencies = {AppComponent.class}, modules = {MainModule.class})
public interface MainComponent {
    void inject (MainActivity activity);
}

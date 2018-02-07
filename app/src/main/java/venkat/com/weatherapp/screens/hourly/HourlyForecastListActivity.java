package venkat.com.weatherapp.screens.hourly;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import venkat.com.weatherapp.application.AppController;
import venkat.com.weatherapp.screens.hourly.core.HourlyPresenter;
import venkat.com.weatherapp.screens.hourly.core.HourlyView;
import venkat.com.weatherapp.screens.hourly.dagger.DaggerHourlyComponent;
import venkat.com.weatherapp.screens.hourly.dagger.HourlyModule;

/**
 * Created by venkat on 2/3/18.
 */

public class HourlyForecastListActivity extends AppCompatActivity{

    @Inject
    HourlyView view;
    @Inject
    HourlyPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerHourlyComponent.builder().appComponent(AppController.getNetComponent()).
                hourlyModule(new HourlyModule(this)).build().inject(this);
        setContentView(view.view());
        presenter.onCreate(getIntent().getStringExtra("state"),getIntent().getStringExtra("city")
                ,getIntent().getIntExtra("day", 0));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}

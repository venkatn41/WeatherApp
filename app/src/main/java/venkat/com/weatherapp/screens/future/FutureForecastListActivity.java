package venkat.com.weatherapp.screens.future;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import venkat.com.weatherapp.application.AppController;
import venkat.com.weatherapp.screens.future.core.FuturePresenter;
import venkat.com.weatherapp.screens.future.core.FutureView;
import venkat.com.weatherapp.screens.future.dagger.DaggerFutureComponent;
import venkat.com.weatherapp.screens.future.dagger.FutureModule;
import venkat.com.weatherapp.screens.hourly.HourlyForecastListActivity;

/**
 * Created by venkat on 2/3/18.
 */

public class FutureForecastListActivity extends AppCompatActivity {

    //Injecting dependencies using dagger
    @Inject
    FutureView view;
    @Inject
    FuturePresenter presenter;

    String state;
    String city;

    private static final String TAG = "FutureForecastList";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            Log.d(TAG,"onCreate");
            DaggerFutureComponent.builder().appComponent(AppController.getNetComponent()).
                    futureModule(new FutureModule(this)).build().inject(this);
            setContentView(view.view());
            if(getIntent() != null) {
                state = getIntent().getStringExtra("state");
                city = getIntent().getStringExtra("city");
            }
            presenter.onCreate(state, city);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    public void goToHourlyForecast(int day) {
        Intent intent = new Intent(this, HourlyForecastListActivity.class);
        intent.putExtra("city",city);
        intent.putExtra("state",state);
        intent.putExtra("day", day);
        startActivity(intent);
    }
}

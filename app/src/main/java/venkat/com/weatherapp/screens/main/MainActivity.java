package venkat.com.weatherapp.screens.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import venkat.com.weatherapp.application.AppController;
import venkat.com.weatherapp.model.forecast.ForecastResponse;
import venkat.com.weatherapp.screens.future.FutureForecastListActivity;
import venkat.com.weatherapp.screens.main.core.MainPresenter;
import venkat.com.weatherapp.screens.main.core.MainView;
import venkat.com.weatherapp.screens.main.dagger.DaggerMainComponent;
import venkat.com.weatherapp.screens.main.dagger.MainModule;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";
    @Inject
    MainView view;
    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerMainComponent.builder().appComponent(AppController.getNetComponent()).
                mainModule(new MainModule(this)).build().inject(this);
        setContentView(view.view());
        presenter.onCreate(getIntent().getStringExtra("location"));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    public void goToFutureForecastDetailsListActivity(ForecastResponse response) {
        Log.d(TAG,"Starting Future Forecast list activity");
        Intent in = new Intent(MainActivity.this, FutureForecastListActivity.class );
        in.putExtra("city",response.getLocation().getCity());
        in.putExtra("state",response.getLocation().getState());
        startActivity(in);
    }
}

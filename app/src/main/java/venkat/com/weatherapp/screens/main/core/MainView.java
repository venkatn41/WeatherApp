package venkat.com.weatherapp.screens.main.core;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.subjects.PublishSubject;
import venkat.com.weatherapp.R;
import venkat.com.weatherapp.screens.main.MainActivity;

/**
 * Created by venkat on 2/3/18.
 *
 * This is the view class of MVP. It is responsible for providing the view to the activity
 */

public class MainView {

    @BindView(R.id.place_name)
    TextView place_name;
    @BindView(R.id.temperature)
    TextView temperature_text;
    @BindView(R.id.forecast_button)
    Button forecast_button;
    @BindView(R.id.no_internet_text)
    TextView no_internet;
    @BindView(R.id.loading_indicator)
    ProgressBar loading;


    //Subject For listening to button click
    public static PublishSubject <View> myEvent = PublishSubject.create ();

    View view;

    public MainView(MainActivity context) {
        RelativeLayout parent = new RelativeLayout(context);
        view = LayoutInflater.from(context).inflate(R.layout.activity_main,parent,true);
        ButterKnife.bind(this, view);
    }

    public View view() {
        return view;
    }

    @OnClick(R.id.forecast_button)
    public void loadForecastActivity() {
        myEvent.onNext(this.forecast_button);
    }

    public Observable<View>  buttonClickObservable()
    {
        return myEvent;
    }

    public void setValues(String location, String temperature){

        //hiding the no internet connection text
        no_internet.setVisibility(View.GONE);
        //hiding the progress spinner
        loading.setVisibility(View.GONE);

        //Showing the values
        place_name.setVisibility(View.VISIBLE);
        temperature_text.setVisibility(View.VISIBLE);
        forecast_button.setVisibility(View.VISIBLE);

        //enabling the get forecast button
        forecast_button.setEnabled(true);

        place_name.setText("Today Weather at "+location);
        temperature_text.setText(temperature);
    }

    public void checkInternetConnection() {

        //Showing the no internet connection text
        no_internet.setVisibility(View.VISIBLE);
        //Hiding other views.
        place_name.setVisibility(View.GONE);
        temperature_text.setVisibility(View.GONE);
        forecast_button.setVisibility(View.GONE);
    }
}

package venkat.com.weatherapp.screens.hourly.core;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import venkat.com.weatherapp.R;
import venkat.com.weatherapp.model.hourly.HourlyForecastItem;
import venkat.com.weatherapp.screens.hourly.HourlyForecastListActivity;
import venkat.com.weatherapp.screens.hourly.list.HourlyAdapter;
import venkat.com.weatherapp.utils.SimpleDividerItemDecoration;

/**
 * Created by venkat on 2/3/18.
 */

public class HourlyView {

    private static final String TAG = "HourlyView";

    @BindView(R.id.forecast_recycler_view)
    RecyclerView list;
    @BindView(R.id.missin_horly_forecast_text_view)
    TextView missngText;

    View view;
    HourlyAdapter adapter;

    public HourlyView(HourlyForecastListActivity context) {
        RelativeLayout parent = new RelativeLayout(context);
        view  = LayoutInflater.from(context).inflate(R.layout.forecast_list_screen, parent, true);
        ButterKnife.bind(this, view);

        adapter = new HourlyAdapter();
        list.setAdapter(adapter);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context);
        list.setLayoutManager(mLayoutManager);
        list.addItemDecoration(new SimpleDividerItemDecoration(context));
    }

    public void swapAdapter(ArrayList<HourlyForecastItem> forecastList, int day)
    {
        Log.d(TAG,"Selected year day :"+day);
        ArrayList<HourlyForecastItem> hourList = new ArrayList<>();
        //hourList contains the hourly forecast for 10days*24hrs=240 items of forecast
        //Filtering the required forecast by comparing the selected year day and the year day in
        //the forecast item.
        for(HourlyForecastItem item : forecastList) {
            if(item.getFCTTIME().getYday().equals(Integer.toString(day))) {
                Log.d(TAG,"Response item year day :"+item.getFCTTIME().getYday());
                hourList.add(item);
            }
            //Show or hide the missing text based on list size.
            if(!hourList.isEmpty()) {
                adapter.swapAdapter(hourList);
                missngText.setVisibility(View.GONE);
            } else {
                missngText.setVisibility(View.VISIBLE);
            }
        }
    }

    public View view() {
        return view;
    }
}

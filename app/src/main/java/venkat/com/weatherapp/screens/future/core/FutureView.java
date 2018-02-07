package venkat.com.weatherapp.screens.future.core;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Observable;
import venkat.com.weatherapp.R;
import venkat.com.weatherapp.model.futureForecast.ForecastdayItem;
import venkat.com.weatherapp.screens.future.FutureForecastListActivity;
import venkat.com.weatherapp.screens.future.list.ForecastAdapter;
import venkat.com.weatherapp.utils.SimpleDividerItemDecoration;

/**
 * Created by venkat on 2/3/18.
 *
 * This class is responsible for intializing
 * the view items and provides it to activity
 */

public class FutureView {

    @BindView(R.id.forecast_recycler_view)
    RecyclerView list;

    View view;
    ForecastAdapter adapter;

    public FutureView(FutureForecastListActivity context) {
        RelativeLayout parent = new RelativeLayout(context);
        parent.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        view  = LayoutInflater.from(context).inflate(R.layout.forecast_list_screen, parent, true);
        ButterKnife.bind(this, view);

        adapter = new ForecastAdapter();

        list.setAdapter(adapter);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(context);

        list.setLayoutManager(mLayoutManager);

        //adding the decorator item to recycler view for divider
        list.addItemDecoration(new SimpleDividerItemDecoration(context));
    }

    //Observer for list item click
    public Observable<Integer> itemClicks()
    {
        return adapter.observeClicks();
    }

    public void swapAdapter(ArrayList<ForecastdayItem> forecastList) {
        adapter.swapAdapter(forecastList);
    }

    public View view() {
        return view;
    }

}

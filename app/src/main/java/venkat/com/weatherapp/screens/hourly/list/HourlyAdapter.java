package venkat.com.weatherapp.screens.hourly.list;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import rx.subjects.PublishSubject;
import venkat.com.weatherapp.R;
import venkat.com.weatherapp.model.hourly.HourlyForecastItem;

/**
 * Created by venkat on 2/3/18.
 */

public class HourlyAdapter extends RecyclerView.Adapter<HourlyForecastViewHolder> {

    private final PublishSubject<Integer> itemClicks = PublishSubject.create();
    ArrayList<HourlyForecastItem> futureForecastList = new ArrayList<>();

    public void swapAdapter(ArrayList<HourlyForecastItem> forecastList) {
        futureForecastList.clear();
        futureForecastList.addAll(forecastList);
        notifyDataSetChanged();
    }

    @Override
    public HourlyForecastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.forecast_row_layout, parent, false);
        return new HourlyForecastViewHolder(view ,itemClicks);
    }

    @Override
    public void onBindViewHolder(HourlyForecastViewHolder holder, int position) {
        HourlyForecastItem forecastdayItem = futureForecastList.get(position);
        holder.bind(forecastdayItem);

    }

    @Override
    public int getItemCount() {
        return futureForecastList.size();
    }
}

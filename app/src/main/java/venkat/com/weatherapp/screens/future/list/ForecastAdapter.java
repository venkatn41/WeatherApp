package venkat.com.weatherapp.screens.future.list;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import rx.Observable;
import rx.subjects.PublishSubject;
import venkat.com.weatherapp.model.futureForecast.ForecastdayItem;
import venkat.com.weatherapp.R;

/**
 * Created by venkat on 2/3/18.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastViewHolder> {

    private final PublishSubject<Integer> itemClicks = PublishSubject.create();
    ArrayList<ForecastdayItem> futureForecastList = new ArrayList<>();

    public void swapAdapter(ArrayList<ForecastdayItem> forecastList) {
        futureForecastList.clear();
        futureForecastList.addAll(forecastList);
        notifyDataSetChanged();
    }


    public Observable<Integer> observeClicks() {
        return itemClicks;
    }

    @Override
    public ForecastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.forecast_row_layout, parent, false);
        return new ForecastViewHolder(view ,itemClicks);
    }

    @Override
    public void onBindViewHolder(ForecastViewHolder holder, int position) {
        ForecastdayItem forecastdayItem = futureForecastList.get(position);
        holder.bind(forecastdayItem);
    }

    @Override
    public int getItemCount() {
        return futureForecastList.size();
    }
}

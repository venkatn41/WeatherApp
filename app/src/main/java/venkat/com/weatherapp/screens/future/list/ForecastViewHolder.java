package venkat.com.weatherapp.screens.future.list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.subjects.PublishSubject;
import venkat.com.weatherapp.R;
import venkat.com.weatherapp.model.futureForecast.ForecastdayItem;

/**
 * Created by venkat on 2/3/18.
 */

public class ForecastViewHolder extends RecyclerView.ViewHolder{

    View view;

    @BindView(R.id.date_textView)
    TextView dateTextView;
    @BindView(R.id.high)
    TextView high;
    @BindView(R.id.low)
    TextView low;


    public ForecastViewHolder(View itemView, PublishSubject<Integer> clickSubject) {
        super(itemView);
        view = itemView;
        ButterKnife.bind(this, view);
        view.setOnClickListener(v -> clickSubject.onNext(getAdapterPosition()));
    }

    void bind(ForecastdayItem forecastItem) {
        dateTextView.setText(forecastItem.getDate().toString());
        high.setText(forecastItem.getHigh().toString());
        low.setText(forecastItem.getLow().toString());
    }
}

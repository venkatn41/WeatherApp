package venkat.com.weatherapp.screens.hourly.list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.subjects.PublishSubject;
import venkat.com.weatherapp.R;
import venkat.com.weatherapp.model.hourly.HourlyForecastItem;

/**
 * Created by venkat on 2/3/18.
 */

public class HourlyForecastViewHolder extends RecyclerView.ViewHolder{

    View view;

    @BindView(R.id.date_textView)
    TextView dateTextView;
    @BindView(R.id.high)
    TextView high;


    public HourlyForecastViewHolder(View itemView, PublishSubject<Integer> clickSubject) {
        super(itemView);
        view = itemView;
        ButterKnife.bind(this, view);
        view.setOnClickListener(v -> clickSubject.onNext(getAdapterPosition()));
    }

    void bind(HourlyForecastItem forecastItem) {
        dateTextView.setText(forecastItem.getFCTTIME().getPretty());
        high.setText(forecastItem.getTemp().toString());
    }
}

package venkat.com.weatherapp.utils.rx;

import rx.Scheduler;

public interface RxSchedulers {
    Scheduler io();
    Scheduler androidThread();
}

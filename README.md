# WeatherApp
* Simple weather app.

# Followed MVP pattern using Retrofit, Dagger2, RxJava2, Butterknife.

# Packages breakdown :

- **api** : retrofit API's reside in this package.

- **application** : all the generic modules which will be used by all activities.

- **model** : all the POJO classes 

- **screens** : each screen is separate child package.

    - Each screen child package is divided into:- 
    
      1.core : MVP classes
        - Model : Provides methods to make the network calls, with return type as observables.
        - View :  This is responsible for initializing the views and provide them to activity and delegate user interactions                     to the presenter.
        - Presenter : Takes the observables form model and converts them to subscriptions and handles the user interactions                         received from View  and it is also responsible for updating the views.

      
      2.dagger : Dependency Injection classes
      
      3.Activity/fragment
        

package venkat.com.weatherapp.screens.splash;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

import venkat.com.weatherapp.R;
import venkat.com.weatherapp.screens.main.MainActivity;
import venkat.com.weatherapp.utils.Constants;

/**
 * Created by venkat on 2/3/18.
 */

public class SplashScreenActivity extends AppCompatActivity implements ActivityCompat.OnRequestPermissionsResultCallback{

    private static String TAG = "SplashScreenActivity";
    private FusedLocationProviderClient mFusedLocationClient;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        setContentView(R.layout.splash_screen);
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 0);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == 0) {
            getCurrentLocation();
        }
    }

    private void getCurrentLocation() {
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
        if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
            mFusedLocationClient.getLastLocation().addOnSuccessListener(this, location -> {
                String currentLocation = Double.toString(location.getLatitude())+","+Double.toString(location.getLongitude());
                //String currentLocation =  "37.776289,-122.395234";
                Log.d(TAG,"current location :"+currentLocation);
                LoadWeatherForCurrentLocation(currentLocation);
            });
    }
}

    private void LoadWeatherForCurrentLocation(String currentLocation) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashScreenActivity.this, MainActivity.class);
                mainIntent.putExtra("location",currentLocation);
                SplashScreenActivity.this.startActivity(mainIntent);
                SplashScreenActivity.this.finish();
            }
        }, Constants.SPLASH_DISPLAY_LENGTH);
    }
}
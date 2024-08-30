package vn.edu.usth.practical_2;

import android.os.Bundle;
import android.util.Log;
import android.app.Fragment;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        Log.i("onCreate", "Create");
        // Create a new Fragment to be placed in the activity layout
        ForecastFragment firstFragment = new ForecastFragment();
        // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction()
                .add(R.id.main, firstFragment)
                .commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart", "Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume", "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("onPause", "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("onStop", "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "Destroy");
    }



}
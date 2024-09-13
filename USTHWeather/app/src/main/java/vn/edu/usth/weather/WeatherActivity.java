package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        tabLayout.setupWithViewPager(viewPager);

        WeatherAdapter adapter = new WeatherAdapter(getSupportFragmentManager())
        adapter.addFragment(new WeatherAndForecastFragment(), "Ha Noi");
        adapter.addFragment(new WeatherAndForecastFragment(), "Paris");
        adapter.addFragment(new WeatherAndForecastFragment(), "Moscow");
        viewPager.setAdapter(adapter);
    }

//        setContentView(R.layout.fragment_forecast);
//        // Create a new Fragment to be placed in the activity layout
//        ForecastFragment firstFragment = new ForecastFragment();
//        // Add the fragment to the 'container' FrameLayout
//        getSupportFragmentManager().beginTransaction()
//                .add(R.id.main, firstFragment)
//                .commit();
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.i("onStart", "Start");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.i("onResume", "Resume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.i("onPause", "Pause");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.i("onStop", "Stop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.i("onDestroy", "Destroy");
//    }
}
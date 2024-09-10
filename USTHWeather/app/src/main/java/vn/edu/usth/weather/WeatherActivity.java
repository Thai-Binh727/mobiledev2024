package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {
    // Practical 1 + 2
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.i("onCreate", "Created");
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
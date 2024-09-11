package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_forecast, container, false);

        // Create linear layout with vertical orientaion
//        LinearLayout linear_layout = new LinearLayout(getActivity());
//        linear_layout.setOrientation(LinearLayout.VERTICAL);
//
//        // Create image view and add the image to that
//        ImageView imageView = new ImageView(getActivity());
//        imageView.setImageResource(R.drawable.weather_icon_2);
//        linear_layout.addView(imageView);
//
//        // Create text view and add text to that
//        TextView textView = new TextView(getActivity());
//        textView.setText("Thursday");
//        linear_layout.addView(textView);
//        textView.setTextColor(0xFF000000);
//
//        // Create a view group to add both text and image view to main
//        ViewGroup rootView = view.findViewById(R.id.main);
//        rootView.addView(linear_layout);
//
//        view.setBackgroundColor(0xFFFFFFFF);
//        return view;
    }
}
package com.example.sacand.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.sacand.R;
import com.example.sacand.ui.viewmodel.RestaurantViewModel;

public class RestaurantFragment extends Fragment {

    private RestaurantViewModel restaurantViewModel;
    CheckBox getRating;
     RatingBar ratingBar;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        restaurantViewModel =
                ViewModelProviders.of(this).get(RestaurantViewModel.class);
        View root = inflater.inflate(R.layout.fragment_restaurant, container, false);
         getRating = root.findViewById(R.id.getRating);
        ratingBar = root.findViewById(R.id.rating);
        getRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getRating.isChecked()){
                    ratingBar.setRating(5.0F);
                }
                else{
                    ratingBar.setRating(0F); }
            }
        });


//        final TextView textView = root.findViewById(R.id.text_res);
//        restaurantViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}
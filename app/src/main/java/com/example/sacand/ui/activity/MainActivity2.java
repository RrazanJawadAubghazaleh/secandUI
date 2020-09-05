package com.example.sacand.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.sacand.R;
import com.example.sacand.ui.fragment.HomeFragment;
import com.example.sacand.ui.fragment.RestaurantFragment;
import com.example.sacand.ui.fragment.SearchFragment;
import com.example.sacand.ui.fragment.UserFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        textView=findViewById(R.id.text_tital_of_app);
        String text = "<font color=#878787>Delivery in:</font> <font color=#ea1d2c> Current Location</font>";
        textView.setText(Html.fromHtml(text));

    }

    BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {

                case R.id.navigation_home:
                    loadFragment( new HomeFragment());
                    return true;
                case R.id.navigation_search:
                    loadFragment(new SearchFragment());
                    return true;
                case R.id.navigation_restaurant:
                    loadFragment(new RestaurantFragment());
                    return true;
                case R.id.navigation_user:
                    loadFragment(new UserFragment());
                    return true; }
            return false;
        }
    };

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.nav_host_fragment, fragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(MainActivity2.this,LoginActivity.class));
        finish();
    }
}
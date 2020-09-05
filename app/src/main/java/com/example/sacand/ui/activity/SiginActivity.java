package com.example.sacand.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.sacand.R;
import com.jaeger.library.StatusBarUtil;

public class SiginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        getWindow().setStatusBarColor(Color.TRANSPARENT);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        getWindow().setNavigationBarColor(getResources().getColor(R.color.colorStrogBlack));

        setContentView(R.layout.activity_sigin);
       // StatusBarUtil.setTransparent(this);
        StatusBarUtil.setLightMode(this);
        StatusBarUtil.setDarkMode(this);

        setUP();

    }

    private void setUP() {
        TextView textView=findViewById(R.id.tv_go_to_login);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SiginActivity.this, LoginActivity.class));
                finish();
            }
        });
    }
}
package com.example.sacand.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.sacand.R;
import com.jaeger.library.StatusBarUtil;

public class LoginActivity extends AppCompatActivity {

    TextView textView;
    Button bnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);

//        getWindow().setFlags(WindowManager.LayoutParams.LAST_SYSTEM_WINDOW,
//                             WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        getWindow().setStatusBarColor(Color.TRANSPARENT);
        getWindow().setNavigationBarColor(getResources().getColor(R.color.colorStrogBlack));

        setContentView(R.layout.activity_login);
        //StatusBarUtil.setColor(this,getResources().getColor(R.color.colorPrimary) ,0);
     //   StatusBarUtil.setTransparent(this);

        StatusBarUtil.setLightMode(this);
        StatusBarUtil.setDarkMode(this);
       // StatusBarUtil.setTranslucent(this,0);

        setUp();
    }

    private void setUp() {
        textView=findViewById(R.id.tv_sigin);
        bnLogin=findViewById(R.id.bn_login);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, SiginActivity.class));
            }
        });

        bnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, MainActivity2.class));
                finish();
            }
        });
    }
}
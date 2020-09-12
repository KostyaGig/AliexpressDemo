package com.kostya_zinoviev.aliexpress;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button loginBtn,registrationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        loginBtn.setOnClickListener(this);
        registrationBtn.setOnClickListener(this);

    }

    private void init() {
        loginBtn = findViewById(R.id.loginBtn);
        registrationBtn = findViewById(R.id.registrationBtn);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
           case R.id.loginBtn:
                Intent loginActivity = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(loginActivity);
            break;
            case R.id.registrationBtn:
                Intent registerActivity = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(registerActivity);
                break;
        }
    }
}

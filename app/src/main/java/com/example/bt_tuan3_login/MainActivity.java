package com.example.bt_tuan3_login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void moveToSignUp(View v) {
        setContentView(R.layout.activity_signup);
    }

    public void moveToLogin(View v) {
        setContentView(R.layout.activity_login);
    }
}

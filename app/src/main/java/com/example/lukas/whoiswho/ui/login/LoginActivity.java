package com.example.lukas.whoiswho.ui.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lukas.whoiswho.R;

import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }
}

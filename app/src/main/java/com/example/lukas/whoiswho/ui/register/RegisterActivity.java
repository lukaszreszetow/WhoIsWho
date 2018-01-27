package com.example.lukas.whoiswho.ui.register;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.lukas.whoiswho.R;
import com.example.lukas.whoiswho.ui.base.BaseActivity;

import javax.inject.Inject;

public class RegisterActivity extends BaseActivity implements RegisterContract.RegisterView {

    @Inject
    RegisterContract.LoginPresenter<RegisterContract.RegisterView, RegisterContract.RegisterInteractor> presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public static Intent getStartIntent(Context context) {
        return new Intent(context, RegisterActivity.class);
    }
}

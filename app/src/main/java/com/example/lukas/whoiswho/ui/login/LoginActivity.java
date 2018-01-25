package com.example.lukas.whoiswho.ui.login;

import android.os.Bundle;

import com.example.lukas.whoiswho.R;
import com.example.lukas.whoiswho.ui.base.BaseActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity implements LoginContract.LoginView{

    private static final String TAG = "LoginActivity";

    @Inject
    LoginContract.LoginPresenter<LoginContract.LoginView, LoginContract.LoginInteractor> presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setUnBinder(ButterKnife.bind(this));
        getActivityComponent().inject(this);
        presenter.onAttach(this);
    }
}

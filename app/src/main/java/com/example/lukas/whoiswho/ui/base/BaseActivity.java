package com.example.lukas.whoiswho.ui.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.example.lukas.whoiswho.App;
import com.example.lukas.whoiswho.di.component.ActivityComponent;
import com.example.lukas.whoiswho.di.component.DaggerActivityComponent;
import com.example.lukas.whoiswho.di.module.ActivityModule;

import butterknife.Unbinder;
import lombok.Getter;
import lombok.Setter;

public abstract class BaseActivity extends AppCompatActivity implements MvpView {

    @Getter
    private ActivityComponent activityComponent;

    @Setter
    private Unbinder unBinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(((App) getApplication()).getApplicationComponent())
                .build();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError(@StringRes int resId) {
        Toast.makeText(this, getString(resId), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(@StringRes int resId) {
        Toast.makeText(this, getString(resId), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        if (unBinder != null) {
            unBinder.unbind();
        }
        super.onDestroy();
    }
}

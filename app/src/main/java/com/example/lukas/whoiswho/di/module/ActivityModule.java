package com.example.lukas.whoiswho.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.example.lukas.whoiswho.di.annotation.ActivityContext;
import com.example.lukas.whoiswho.di.annotation.PerActivity;
import com.example.lukas.whoiswho.rx.AppSchedulerProvider;
import com.example.lukas.whoiswho.rx.SchedulerProvider;
import com.example.lukas.whoiswho.ui.login.LoginContract;
import com.example.lukas.whoiswho.ui.login.LoginInteractor;
import com.example.lukas.whoiswho.ui.login.LoginPresenter;

import io.reactivex.disposables.CompositeDisposable;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    LoginContract.LoginPresenter<LoginContract.LoginView, LoginContract.LoginInteractor> provideLoginPresenter(
            LoginPresenter<LoginContract.LoginView, LoginContract.LoginInteractor> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LoginContract.LoginInteractor provideLoginMvpInteractor(LoginInteractor interactor) {
        return interactor;
    }

}

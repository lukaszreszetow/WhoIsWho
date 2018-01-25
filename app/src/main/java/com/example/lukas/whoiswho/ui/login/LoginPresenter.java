package com.example.lukas.whoiswho.ui.login;

import com.example.lukas.whoiswho.rx.SchedulerProvider;
import com.example.lukas.whoiswho.ui.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class LoginPresenter<V extends LoginContract.LoginView, I extends LoginContract.LoginInteractor>
        extends BasePresenter<V, I> implements LoginContract.LoginPresenter<V, I>{

    private static final String TAG = "LoginPresenter";

    @Inject
    public LoginPresenter(I mvpInteractor, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(mvpInteractor, schedulerProvider, compositeDisposable);
    }

}

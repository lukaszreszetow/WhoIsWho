package com.example.lukas.whoiswho.ui.register;


import com.example.lukas.whoiswho.rx.SchedulerProvider;
import com.example.lukas.whoiswho.ui.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class RegisterPresenter<V extends RegisterContract.RegisterView, I extends RegisterContract.RegisterInteractor>
        extends BasePresenter<V, I> implements RegisterContract.RegisterPresenter<V, I> {

    @Inject
    public RegisterPresenter(I mvpInteractor, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(mvpInteractor, schedulerProvider, compositeDisposable);
    }
}

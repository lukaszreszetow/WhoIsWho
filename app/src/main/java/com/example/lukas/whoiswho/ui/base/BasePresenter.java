package com.example.lukas.whoiswho.ui.base;

import com.example.lukas.whoiswho.rx.SchedulerProvider;
import com.google.firebase.auth.FirebaseAuth;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import lombok.Getter;

@Getter
public class BasePresenter<V extends MvpView, I extends MvpInteractor>
        implements MvpPresenter<V, I> {

    private static final String TAG = "BasePresenter";

    private final SchedulerProvider schedulerProvider;

    private final CompositeDisposable compositeDisposable;

    private V mvpView;

    private I mvpInteractor;

    @Inject
    public BasePresenter(I mvpInteractor, SchedulerProvider schedulerProvider,
                         CompositeDisposable compositeDisposable) {
        this.mvpInteractor = mvpInteractor;
        this.schedulerProvider = schedulerProvider;
        this.compositeDisposable = compositeDisposable;
    }

    @Override
    public void onAttach(V mvpView) {
        this.mvpView = mvpView;
    }

    @Override
    public void onDetach() {
        compositeDisposable.dispose();
        mvpView = null;
    }

    @Override
    public void signOut() {
        FirebaseAuth.getInstance().signOut();
    }

    public static class MvpViewNotAttachedException extends RuntimeException {
        public MvpViewNotAttachedException() {
            super("Please call Presenter.onAttach(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }

}

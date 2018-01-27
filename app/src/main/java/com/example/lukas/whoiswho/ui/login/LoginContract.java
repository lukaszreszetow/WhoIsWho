package com.example.lukas.whoiswho.ui.login;

import com.example.lukas.whoiswho.di.annotation.PerActivity;
import com.example.lukas.whoiswho.ui.base.MvpInteractor;
import com.example.lukas.whoiswho.ui.base.MvpPresenter;
import com.example.lukas.whoiswho.ui.base.MvpView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;

public class LoginContract {

    @PerActivity
    public interface LoginPresenter<V extends LoginContract.LoginView, I extends LoginContract.LoginInteractor> extends MvpPresenter<V, I> {
    }

    public interface LoginInteractor extends MvpInteractor {
    }

    public interface LoginView extends MvpView {
    }
}

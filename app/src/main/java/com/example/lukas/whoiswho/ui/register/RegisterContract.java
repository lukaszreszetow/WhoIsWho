package com.example.lukas.whoiswho.ui.register;


import com.example.lukas.whoiswho.di.annotation.PerActivity;
import com.example.lukas.whoiswho.ui.base.MvpInteractor;
import com.example.lukas.whoiswho.ui.base.MvpPresenter;
import com.example.lukas.whoiswho.ui.base.MvpView;
import com.google.firebase.auth.FirebaseUser;

public class RegisterContract {

    @PerActivity
    public interface RegisterPresenter<V extends RegisterContract.RegisterView, I extends RegisterContract.RegisterInteractor> extends MvpPresenter<V, I> {
    }

    public interface RegisterInteractor extends MvpInteractor {
        void saveFirebaseUserToDatabase(FirebaseUser firebaseUser);
    }

    public interface RegisterView extends MvpView {
    }
}

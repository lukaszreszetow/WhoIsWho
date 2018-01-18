package com.example.lukas.whoiswho.ui.base;

public interface MvpPresenter<V extends MvpView, I extends MvpInteractor> {

    void onAttach(V mvpView);

    void onDetach();

    void signOut();
}

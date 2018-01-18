package com.example.lukas.whoiswho.ui.base;

import android.support.annotation.StringRes;

public interface MvpView {

    void showLoading();

    void hideLoading();

    void showError(@StringRes int resId);

    void showError(String message);

    void showMessage(String message);

    void showMessage(@StringRes int resId);
}
package com.example.lukas.whoiswho.ui.base;

import com.example.lukas.whoiswho.data.preference.IPreferenceHelper;

import javax.inject.Inject;

import lombok.Getter;

@Getter
public class BaseInteractor implements MvpInteractor {

    private final IPreferenceHelper preferenceHelper;

    @Inject
    public BaseInteractor(IPreferenceHelper preferenceHelper) {
        this.preferenceHelper = preferenceHelper;
    }
}

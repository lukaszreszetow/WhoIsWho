package com.example.lukas.whoiswho.di.module;

import android.app.Application;
import android.content.Context;

import com.example.lukas.whoiswho.constant.AppConstants;
import com.example.lukas.whoiswho.data.preference.IPreferenceHelper;
import com.example.lukas.whoiswho.data.preference.PreferenceHelper;
import com.example.lukas.whoiswho.di.annotation.ApplicationContext;
import com.example.lukas.whoiswho.di.annotation.PreferenceInfo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    IPreferenceHelper providePreferencesHelper(PreferenceHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }
}
package com.example.lukas.whoiswho.di.component;

import android.app.Application;
import android.content.Context;

import com.example.lukas.whoiswho.App;
import com.example.lukas.whoiswho.data.preference.IPreferenceHelper;
import com.example.lukas.whoiswho.di.annotation.ApplicationContext;
import com.example.lukas.whoiswho.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(App app);

    @ApplicationContext
    Context context();

    Application application();

    IPreferenceHelper preferencesHelper();
}

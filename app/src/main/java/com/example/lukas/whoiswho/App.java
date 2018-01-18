package com.example.lukas.whoiswho;

import android.app.Application;
import android.content.Context;

import com.example.lukas.whoiswho.di.component.ApplicationComponent;
import com.example.lukas.whoiswho.di.component.DaggerApplicationComponent;
import com.example.lukas.whoiswho.di.module.ApplicationModule;

import lombok.Getter;
import lombok.Setter;

public class App extends Application {

    @Getter @Setter
    protected ApplicationComponent applicationComponent;

    private static App sApp;

    private App app;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
        sApp = this;
        app = this;
    }

    public static App get(Context context){
        return (App) context.getApplicationContext();
    }

    public static App getApp() {
        return sApp;
    }
}

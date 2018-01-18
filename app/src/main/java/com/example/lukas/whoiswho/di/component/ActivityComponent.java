package com.example.lukas.whoiswho.di.component;

import com.example.lukas.whoiswho.di.annotation.PerActivity;
import com.example.lukas.whoiswho.di.module.ActivityModule;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

   // void inject(LoginActivity loginActivity);
}
package com.example.lukas.whoiswho.data.preference;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.lukas.whoiswho.di.annotation.ApplicationContext;
import com.example.lukas.whoiswho.di.annotation.PreferenceInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class PreferenceHelper implements IPreferenceHelper {

    private final SharedPreferences mPrefs;

    @Inject
    public PreferenceHelper(@ApplicationContext Context context,
                                @PreferenceInfo String prefFileName) {
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }
}
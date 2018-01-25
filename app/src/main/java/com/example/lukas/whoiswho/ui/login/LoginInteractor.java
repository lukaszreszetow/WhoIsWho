package com.example.lukas.whoiswho.ui.login;

import com.example.lukas.whoiswho.data.firebase.repository.FirebaseRepository;
import com.example.lukas.whoiswho.data.preference.IPreferenceHelper;
import com.example.lukas.whoiswho.ui.base.BaseInteractor;
import com.google.firebase.auth.FirebaseUser;

import javax.inject.Inject;

public class LoginInteractor extends BaseInteractor implements LoginContract.LoginInteractor {

    private FirebaseRepository firebaseRepository;

    @Inject
    public LoginInteractor(IPreferenceHelper preferenceHelper, FirebaseRepository firebaseRepository) {
        super(preferenceHelper);
        this.firebaseRepository = firebaseRepository;
    }

    @Override
    public void saveFirebaseUserToDatabase(FirebaseUser firebaseUser) {

    }
}

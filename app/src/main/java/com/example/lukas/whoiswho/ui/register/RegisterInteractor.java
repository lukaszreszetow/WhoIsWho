package com.example.lukas.whoiswho.ui.register;


import com.example.lukas.whoiswho.data.firebase.repository.FirebaseRepository;
import com.example.lukas.whoiswho.data.preference.IPreferenceHelper;
import com.example.lukas.whoiswho.ui.base.BaseInteractor;
import com.google.firebase.auth.FirebaseUser;

import javax.inject.Inject;

public class RegisterInteractor extends BaseInteractor implements RegisterContract.RegisterInteractor {

    private FirebaseRepository firebaseRepository;

    @Inject
    public RegisterInteractor(IPreferenceHelper preferenceHelper, FirebaseRepository firebaseRepository) {
        super(preferenceHelper);
        this.firebaseRepository = firebaseRepository;
    }
    @Override
    public void saveFirebaseUserToDatabase(FirebaseUser firebaseUser) {

    }

}

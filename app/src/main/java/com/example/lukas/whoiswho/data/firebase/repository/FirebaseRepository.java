package com.example.lukas.whoiswho.data.firebase.repository;


import javax.inject.Inject;

public class FirebaseRepository implements IFirebaseRepository{

    @Inject
    public FirebaseRepository() {

    }
/*
    @Override
    public void saveUser(User user) {
        FirebaseDatabase.getInstance().getReference()
                .child(FirebaseReferences.USER)
                .child(user.getUid())
                .setValue(user);
    }
    */
}

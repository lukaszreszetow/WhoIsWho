package com.example.lukas.whoiswho.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.lukas.whoiswho.R;
import com.example.lukas.whoiswho.ui.base.BaseActivity;
import com.example.lukas.whoiswho.ui.register.RegisterActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginContract.LoginView{

    private static final String TAG = "LoginActivity";

    @Inject
    LoginContract.LoginPresenter<LoginContract.LoginView, LoginContract.LoginInteractor> presenter;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @BindView(R.id.email_edittext)
    EditText emailET;

    @BindView(R.id.haslo_editText)
    EditText hasloET;

    @OnClick(R.id.login_button)
    void onLoginButton(View v){

    }

    @OnClick(R.id.register_button)
    void onRegisterButton(View v){

        startActivity(RegisterActivity.getStartIntent(this));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setUnBinder(ButterKnife.bind(this));
        getActivityComponent().inject(this);
        presenter.onAttach(this);
        checkIfLogged();
    }

    private void checkIfLogged() {
        mAuth = FirebaseAuth.getInstance();
        mAuthListener = firebaseAuth -> startNextActivity(mAuth.getCurrentUser());
        mAuth.addAuthStateListener(mAuthListener);
    }

    private void startNextActivity(FirebaseUser user) {
        if (user != null) {
          //  startActivity(new Intent(this, MenuActivity.class));
        } else {
         //   showMessage(R.string.successful_logout);
        }
    }

    public static Intent getStartIntent(Context context) {
        return new Intent(context, LoginActivity.class);
    }

    @Override
    protected void onDestroy() {
        presenter.onDetach();
        super.onDestroy();
    }
}

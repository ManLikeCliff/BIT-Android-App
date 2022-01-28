package com.wema.employeebio_dataapp.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.wema.employeebio_dataapp.R;

public class AdminLoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login_screen);
        getSupportActionBar().hide();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
        }
    }

    public void callLoginScreen(View view) {

        Intent intent = new Intent(getApplicationContext(), Login.class);

        Pair[] pairs = new Pair[1];

        pairs[0] = new Pair<View, String>(findViewById(R.id.login_btn), "transition_login");

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(AdminLoginScreen.this, pairs);
        startActivity(intent, options.toBundle());
    }

    public void callSignupScreen(View view) {
        Intent intent = new Intent(getApplicationContext(), SignUp.class);

        Pair[] pairs = new Pair[1];

        pairs[0] = new Pair<View, String>(findViewById(R.id.signup_btn), "transition_signup");

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(AdminLoginScreen.this, pairs);
        startActivity(intent, options.toBundle());
    }
}
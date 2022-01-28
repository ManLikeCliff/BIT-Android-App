package com.wema.employeebio_dataapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SearchPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);
    }

    public void toProfile(View view) {
        Intent profile = new Intent(this, ProfilePage.class);
        startActivity(profile);
    }
}
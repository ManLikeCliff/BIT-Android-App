package com.wema.employeebio_dataapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class RegistrationPage extends AppCompatActivity {

    EditText eFirstName, eLastName;
    String firstName = "", lastName = "";
    Button save, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        Spinner dept = (Spinner) findViewById(R.id.departments);

        ArrayAdapter<String> myDept = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myDept.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dept.setAdapter(myDept);

        Spinner state = (Spinner) findViewById(R.id.states);

        ArrayAdapter<String> myState = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.states));
        myState.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        state.setAdapter(myState);

        eFirstName = findViewById(R.id.firstName);
        eLastName = findViewById(R.id.lastName);
        save = findViewById(R.id.save_button);
        clear = findViewById(R.id.clear_buuton);

        save.setOnClickListener(v -> toSuccess());
        clear.setOnClickListener(v -> dataCheck());
    }

    private void dataCheck() {
    }

    private void toSuccess() {
    }

    public void toSuccess(View view) {
        Intent save = new Intent(this, SuccessPage.class);
        startActivity(save);
    }
}
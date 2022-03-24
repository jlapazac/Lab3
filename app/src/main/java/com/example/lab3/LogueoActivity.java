package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class LogueoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logueo);
    }

    public void login(View view){
        EditText user = this.findViewById(R.id.editTextTextEmailAddress);
        EditText pass = this.findViewById(R.id.editTextTextPassword2);

        String x = user.getText().toString();
        String y = pass.getText().toString();

        Log.i("======>", x);
        Log.i("======>", y);

        startActivity(new Intent(this, MainActivity.class));
    }
}
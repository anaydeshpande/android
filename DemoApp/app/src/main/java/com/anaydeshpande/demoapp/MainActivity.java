package com.anaydeshpande.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickMe(View view){

        EditText myEditTextUsername = (EditText) findViewById(R.id.myEditTextUsername);
        EditText myEditTextPassword = (EditText) findViewById(R.id.myEditTextPassword);
        Toast.makeText(MainActivity.this, myEditTextUsername.getText().toString(), Toast.LENGTH_LONG).show();

        Log.i("Info",myEditTextUsername.getText().toString());
        Log.i("Info", myEditTextPassword.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

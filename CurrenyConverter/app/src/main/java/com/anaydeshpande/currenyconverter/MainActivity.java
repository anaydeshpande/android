package com.anaydeshpande.currenyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

        public void convert(View view) {

        EditText editAmountText = (EditText) findViewById(R.id.editAmountText);
        //Get billTotal
        Double dollorAmount = Double.parseDouble(editAmountText.getText().toString());

        //Determine total
        Double total = dollorAmount * 65;

        Toast.makeText(MainActivity.this, "In INR " + String.format("%.2f", total), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}

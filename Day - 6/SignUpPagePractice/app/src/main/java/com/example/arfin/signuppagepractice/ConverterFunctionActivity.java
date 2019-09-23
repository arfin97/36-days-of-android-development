package com.example.arfin.signuppagepractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConverterFunctionActivity extends AppCompatActivity {
    private Button btnGoToConvertCurrency;
    private Button btnGoToConvertLength;
    private Button btnGoToConvertWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter_function);
        init();

        btnGoToConvertCurrency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ConvertCurrencyActivity.class);
                startActivity(intent);
            }
        });
    }

    private void init() {
        btnGoToConvertCurrency = findViewById(R.id.btnGoToConvertCurrency);
        btnGoToConvertLength = findViewById(R.id.btnGoToConvertLength);
        btnGoToConvertWeight = findViewById(R.id.btnGoToConvertWeight);

    }
}

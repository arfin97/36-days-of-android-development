package com.example.arfin.signuppagepractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ConvertCurrencyActivity extends AppCompatActivity {
    private EditText etCurrencyInput;
    private RadioGroup rgCurrencyConversionTypes;
    private RadioButton rbTakatoUSD;
    private RadioButton rbTakatoRupee;
    private RadioButton rbUSDtoTaka;
    private RadioButton rbRupeetoTaka;
    private Button btnConvertCurrency;
    private TextView tvCurrencyConvertedResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert_currency);
        init();

        btnConvertCurrency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etCurrencyInput.getText().toString().matches("") == false){
                    Double data = new Double(etCurrencyInput.getText().toString());
                    if (rgCurrencyConversionTypes.getCheckedRadioButtonId() != -1){
                        Integer radioButtonId = rgCurrencyConversionTypes.getCheckedRadioButtonId();

                        Double result;
                        if(radioButtonId == R.id.rbTakatoUSD){
                            result = data/85.00;
                            tvCurrencyConvertedResult.setText(result.toString());
                            Toast.makeText(ConvertCurrencyActivity.this, data.toString(), Toast.LENGTH_SHORT).show();
                        }

                        if(radioButtonId == R.id.rbUSDtoTaka){
                            result = data*85.00;
                            tvCurrencyConvertedResult.setText(result.toString());
                            Toast.makeText(ConvertCurrencyActivity.this, data.toString(), Toast.LENGTH_SHORT).show();

                        }

                        if(radioButtonId == R.id.rbTakatoRupee){
                            result = data/1.50;
                            tvCurrencyConvertedResult.setText(result.toString());
                            Toast.makeText(ConvertCurrencyActivity.this, data.toString(), Toast.LENGTH_SHORT).show();

                        }

                        if(radioButtonId == R.id.rbRupeetoTaka){
                            result = data*1.50;
                            tvCurrencyConvertedResult.setText(result.toString());
                            Toast.makeText(ConvertCurrencyActivity.this, data.toString(), Toast.LENGTH_SHORT).show();

                        }

                    }
                    else{
                        Toast.makeText(ConvertCurrencyActivity.this, "Select A conversion Method", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(ConvertCurrencyActivity.this, "Write a number", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    private void init() {
        etCurrencyInput = findViewById(R.id.etCurrencyInput);
        rgCurrencyConversionTypes = findViewById(R.id.rgCurrencyConversionTypes);
        rbTakatoUSD = findViewById(R.id.rbTakatoUSD);
        rbTakatoRupee = findViewById(R.id.rbTakatoRupee);
        rbUSDtoTaka = findViewById(R.id.rbUSDtoTaka);
        rbRupeetoTaka = findViewById(R.id.rbRupeetoTaka);
        btnConvertCurrency = findViewById(R.id.btnConvertCurrency);
        tvCurrencyConvertedResult = findViewById(R.id.tvCurrencyConvertedResult);
    }
}

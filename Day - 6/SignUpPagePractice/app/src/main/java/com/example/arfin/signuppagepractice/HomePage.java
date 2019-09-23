package com.example.arfin.signuppagepractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {
    private TextView tvHome;
    private Button btnConverterFunction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        tvHome = findViewById(R.id.tvHome);
        Intent i = getIntent();
        String firstName = i.getStringExtra("firstName");
        String lastName = i.getStringExtra("lastName");
        String fullName = firstName+ " " +lastName + " " + "\n" + "Please chose your desired functionality";
        tvHome.setText("Welcome " + fullName);

        init();

        btnConverterFunction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ConverterFunctionActivity.class);
                startActivity(intent);

            }
        });

    }

    private void init() {
        btnConverterFunction = findViewById(R.id.btnConverterFunction);
    }

}

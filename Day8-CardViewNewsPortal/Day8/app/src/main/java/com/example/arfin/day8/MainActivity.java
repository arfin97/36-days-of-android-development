package com.example.arfin.day8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button news1;
    private Button news2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        news1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), NewsDetailActivity.class);
                i.putExtra("news", "news1");
                startActivity(i);
            }
        });

        news2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), NewsDetailActivity.class);
                i.putExtra("news", "news2");
                startActivity(i);
            }
        });
    }

    private void init() {
        news1 = findViewById(R.id.news1);
        news2 = findViewById(R.id.news2);
    }
}

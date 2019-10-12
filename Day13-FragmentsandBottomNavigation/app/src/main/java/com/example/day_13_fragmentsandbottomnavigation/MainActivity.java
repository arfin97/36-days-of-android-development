package com.example.day_13_fragmentsandbottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    private Button btnFragmentOne, btnFragmentTwo;
    private BottomNavigationView bottomNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        init();
        bottomNavigationBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                if (menuItem.getItemId() == R.id.menuHomebtn) {
//                    getSupportFragmentManager().beginTransaction().replace(R.id.frameFragmentMainActivity, new HomeFragment()).commit();
//                    return true;
//                }
//                else if (menuItem.getItemId() == R.id.menuHomebtn) {
//                    getSupportFragmentManager().beginTransaction().replace(R.id.frameFragmentMainActivity, new CartFragment()).commit();
//                    return true;
//                }
//                else if (menuItem.getItemId() == R.id.menuHomebtn) {
//                    getSupportFragmentManager().beginTransaction().replace(R.id.frameFragmentMainActivity, new MoreFragment()).commit();
//                    return true;
//                }

                switch (menuItem.getItemId()){
                    case R.id.menuHomebtn:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameFragmentMainActivity, new HomeFragment()).commit();
                        return true;
                    case R.id.menuCartbtn:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameFragmentMainActivity, new CartFragment()).commit();
                        return true;
                    case R.id.menuMorebtn:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frameFragmentMainActivity, new MoreFragment()).commit();

                }
                return false;
            }
        });



    }

    private void init() {
        bottomNavigationBar = findViewById(R.id.bottomNavigationBar);
    }


}

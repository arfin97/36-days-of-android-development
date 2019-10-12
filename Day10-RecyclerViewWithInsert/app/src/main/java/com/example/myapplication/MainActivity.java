package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Student> studentList;
    private RecyclerView recyclerView;
    private StudentAdapter adapter;
    private EditText etName, etId, etEmail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        studentList = new ArrayList();
        studentList.add(new Student("Arfin", "161", "arfin@gmail.com"));
        recyclerView = findViewById(R.id.rvStudent);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new StudentAdapter(studentList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }

    private void init() {
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etId = findViewById(R.id.etId);
    }

    public void clickInsertShowToast(View view) {
        String name = etName.getText().toString();
        String id = etId.getText().toString();
        String email = etEmail.getText().toString();

        if(name.equals("") || id.equals("") || id.equals("")){
            Toast.makeText(this, "Fillup all the Fields", Toast.LENGTH_SHORT).show();

        }
        else{
            studentList.add(new Student(name, id, email));
            adapter.notifyDataSetChanged();
        }





    }
}

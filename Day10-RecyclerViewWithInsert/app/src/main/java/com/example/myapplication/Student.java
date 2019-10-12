package com.example.myapplication;

public class Student {
    private String name;
    private String id;
    private String email;

    public Student() {
    }

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}

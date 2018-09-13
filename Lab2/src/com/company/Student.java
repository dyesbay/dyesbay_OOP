package com.company;

public class Student {
    private String id;
    private String name;
    private int yearOfStudy;
    Student (String n, int year) {
        name = n;
        yearOfStudy = 2019 - year;
        id = year + name;
    }
    public String getName () {
        return name;
    }
    public String getId () {
        return id;
    }

    public void incrementYear (){
        yearOfStudy++;
    }
}
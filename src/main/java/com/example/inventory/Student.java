package com.example.inventory;
//motsvarar inventoryitem
public class Student {

    private String year;
    private String name;
    private String birthYear;
    public String id;


    public Student() {}

    public Student(String year, String name, String birthYear, String id) {

        this.year = year;
        this.name = name;
        this.birthYear = birthYear;
        this.id = id;

    }


    public String getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getBirthYear() { return birthYear; }

    public String getID() { return id; }


}

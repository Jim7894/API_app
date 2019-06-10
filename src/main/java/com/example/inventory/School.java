package com.example.inventory;

import java.util.ArrayList;
import java.util.List;

public class School {
    // motsvarar inventory

    private List<Student> school;
    private List<Course> courses;


    //vi gör school listan till en array list och  kör addMockData metoden.
    public School() {
        this.school = new ArrayList<>();
        addMockData();
    }


    public List<Student> getSchool(String searchString) {
        if (searchString == "")
            return school;


        ArrayList<Student> students = new ArrayList<>();
        for (Student student : school) {
            if (student.getName().contains(searchString))
                students.add(student);
        }

        return students;
    }

    /*public List<Course> getSchool2(String searchString) {
        if (searchString == "")
            return school2;

        ArrayList<Course> courses = new ArrayList<>();
        for (Course course : school2) {
            if (course.getcourseName().contains(searchString))
                courses.add(course);
        }

        return courses;
    }*/

    Student getStudentById(String id) {
        for (Student student : school) {
            if (student.getID().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void addStudent(Student student) {
        school.add(student);
    }
    
     public void removeStudent(Student student) {
        school.remove(student);
    }

    private void addMockData() {

        Course course = new Course("Math", "Algebra", "Stuart");
        //addCourse(course);

        Student student = new Student("7", "John","2006","1");
        addStudent(student);

    }


    /*public void addCourse(Course course) {
        school2.add(course);
    }*/
    /*private void addMockData() {
        Course course = new Course("Math", "Algebra", "Stuart");
        //addCourse(course);
    }*/
}

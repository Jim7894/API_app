package com.example.inventory;

//hade subjects till en array innan
//motsvarar manufactor
public class Course {


        private String courseName;
        private String subjects;
        private String teacher;


        public Course(String name, String subjects, String teacher) {
            this.courseName = name;
            this.subjects = subjects;
            this.teacher = teacher;
        }

        public String getcourseName() {
            return courseName;
        }

        public String getSubjects() {
            return subjects;
        }

        public String getTeacher() {
            return teacher;
        }
}

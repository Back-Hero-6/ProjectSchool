package org.example;

public class Student {
    private String studentId; //Tiene que ser auto generated (pendiente)
    private String name;
    private String address;
    private String email;
    private Course course;

    //Constructor
    public Student(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    //Getters & Setters

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
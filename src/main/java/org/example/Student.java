package org.example;

import java.util.Objects;

public class Student {
    private String studentId; //Tiene que ser auto generated (pendiente)
    private String name;
    private String address;
    private String email;
    private Course course;

    private static int nextId = 1;
    private final int id;

    //Constructor
    public Student(String name, String address, String email) {
        setName(name);
        setAddress(address);
        setEmail(email);
        id = nextId++;
        setStudentId();
    }

    //Getters & Setters

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId() {
            this.studentId = "S-"+id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId) && Objects.equals(name, student.name) && Objects.equals(address, student.address) && Objects.equals(email, student.email) && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name, address, email, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", course=" + course +
                '}';
    }
}

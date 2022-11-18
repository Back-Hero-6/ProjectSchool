package org.example;

public class Teacher {
    private String teacherId; //Tiene que ser auto generated (pendiente)
    private String name;
    private double salary;


    //Constructor

    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //Getters & Setters

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
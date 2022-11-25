package org.example;

public class Course {

    private String courseId;
    private String name;
    private double price;
    private double moneyEarned;
    private Teacher teacher;

    private static int nextId = 1;
    private final int id;

    //Constructor

    public Course(String name, double price) {
        setName(name);
        setPrice(price);
        id = nextId++;
        setCourseId();
    }

    //Getters & Setters

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId() {
        this.courseId = "C"+id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", moneyEarned=" + moneyEarned +
                ", teacher=" + teacher +
                '}';
    }
}

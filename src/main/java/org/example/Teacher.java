package org.example;

import java.util.Objects;

public class Teacher {
    private String teacherId;
    private String name;
    private double salary;

    private static int nextId = 1;
    private final int id;


    //Constructor

    public Teacher(String name, double salary) {
        setName(name);
        setSalary(salary);
        id = nextId++;
        setTeacherId();
    }


    //Getters & Setters

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId() {
        this.teacherId = "T"+id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Double.compare(teacher.salary, salary) == 0 && Objects.equals(teacherId, teacher.teacherId) && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId, name, salary);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

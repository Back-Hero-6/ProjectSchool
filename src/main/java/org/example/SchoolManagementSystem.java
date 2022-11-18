package org.example;


import java.util.List;
import java.util.Scanner;

public class SchoolManagementSystem {

    private String schoolName;
    private List<Teacher> teacherList;
    private List<Student> studentList;
    private List<Course> courseList;

    //Constructor

    public SchoolManagementSystem(String schoolName, List<Teacher> teacherList, List<Student> studentList, List<Course> courseList) {
       setSchoolName(schoolName);
        this.teacherList = teacherList;
        this.studentList = studentList;
        this.courseList = courseList;
    }

    public SchoolManagementSystem(String schoolName) {
        setSchoolName(schoolName);
    }
    //Getters & Setters

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {

        this.schoolName = schoolName;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }



    //FUNCTIONS

    public void enroll(String studentId, String courseId){

    }
    public void assign(String teacherId, String courseId){

    }
    public void showCourses(){

    }
    public void lookupCourses(String courseId){

    }
    public void showStudents(){

    }
    public void lookupStudent( String studentId){

    }
    public void showTeachers(){

    }
    public void lookupTeacher( String teacherId){

    }
    public void showProfit(){

    }

    //Se pueden añadir mas funciones
}

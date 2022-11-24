package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SchoolManagementSystem {

    private String schoolName;
    private List<Teacher> teacherList;
    private List<Student> studentList;
    private List<Course> courseList;

    //Constructor

    public SchoolManagementSystem(String schoolName, List<Teacher> teacherList, List<Student> studentList, List<Course> courseList) {
        setSchoolName(schoolName);
        setTeacherList(teacherList);
        setStudentList(studentList);
        setCourseList(courseList);
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

    public Student lookUpStudentById(String studentId) {
        Student result = new Student();
        for (Student s : studentList) {
            if (s.getStudentId().equals(studentId)) {
                result.equals(s);
            } else {
                throw new IllegalArgumentException("Please insert a valid student ID");
            }
        }
        return result;
    }

    public Course lookUpCourseById(String courseId) {
        Course result = new Course();
        for (Course c : courseList) {
            if (c.getCourseId().equals(courseId)) {
                result.equals(c);
            } else {
                throw new IllegalArgumentException("Please insert a valid course ID");
            }
        }
        return result;
    }

    public Teacher lookUpTeacherById(String teacherId) {
        Teacher result = new Teacher();
        for (Teacher t : teacherList) {
            if (t.getTeacherId().equals(teacherId)) {
                result.equals(t);
            } else {
                throw new IllegalArgumentException("Please insert a valid teacher ID");
            }
        }
        return result;
    }


    public void enroll(String studentId, String courseId){
        Student s = lookUpStudentById(studentId);
        Course c = lookUpCourseById(courseId);
        s.setCourse(c);
        c.setMoneyEarned(c.getMoneyEarned() + c.getPrice());
//        Map<String, String> enrolled = new HashMap<>();
//        enrolled.put(studentId, courseId);
    }
    public void assignTeacher(String teacherId, String courseId){
        Teacher t = lookUpTeacherById(teacherId);
        Course c = lookUpCourseById(courseId);
        c.setTeacher(t);
    }
    public void showCourses(){
        getCourseList().toString();
    }

    public void showStudents(){
        getStudentList().toString();
    }

    public void showTeachers(){
        getTeacherList().toString();
    }

    public void showProfit(){
        //(The total money earned from all courses) - (The sum of all the teachers’ salaries) and return the result

    }

    //Se pueden añadir mas funciones
}

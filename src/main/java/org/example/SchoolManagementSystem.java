package org.example;

import java.util.List;

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
        for (Student s : studentList) {
            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }
        System.err.println("Student ID not valid");
        return null;
    }

    public Course lookUpCourseById(String courseId) {
        for (Course c : courseList) {
            if (c.getCourseId().equals(courseId)) {
                return c;
            }
        }
        System.err.println("Course ID not valid");
        return null;
    }

    public Teacher lookUpTeacherById(String teacherId) {
        for (Teacher t : teacherList) {
            if (t.getTeacherId().equals(teacherId)) {
                return t;
            }
        }
        System.err.println("Teacher ID not valid");
        return null;
    }


    public void enroll(String studentId, String courseId) {
        Student s = lookUpStudentById(studentId);
        Course c = lookUpCourseById(courseId);
        s.setCourse(c);
        c.setMoneyEarned(c.getMoneyEarned() + c.getPrice());
    }

    public void assignTeacher(String teacherId, String courseId) {
        Teacher t = lookUpTeacherById(teacherId);
        Course c = lookUpCourseById(courseId);
        c.setTeacher(t);
    }

    public String showCourses() {
        return getCourseList().toString();
    }

    public String showStudents() {
        return getStudentList().toString();
    }

    public String showTeachers() {
        return getTeacherList().toString();
    }

    public double showProfit() {
        double sumMoneyEarned = 0;
        double sumSalaries = 0;
        for (Course c : courseList) {
            sumMoneyEarned = sumMoneyEarned + c.getMoneyEarned();
        }
        for (Teacher t : teacherList) {
            sumSalaries = sumSalaries + t.getSalary();
        }
        return sumMoneyEarned - sumSalaries;
    }
}

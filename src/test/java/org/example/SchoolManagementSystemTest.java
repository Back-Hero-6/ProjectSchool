package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolManagementSystemTest {

    Student s1 = new Student("Gonzalo", "Calle Badajoz 26", "gonzalo@mail");
    Student s2 = new Student("Susana", "Calle Susana 22", "susana@email");
    Teacher t1 = new Teacher("Susana", 1000);
    Teacher t2 = new Teacher("Javier",1000);
    Course c1 = new Course("Java", 2000);
    Course c2 = new Course("JS", 1500);

    List<Student> ls = Arrays.asList(s1,s2);
    List<Teacher> lt = Arrays.asList(t1,t2);
    List<Course> lc = Arrays.asList(c1,c2);


    // Testing method enroll(), by checking if students are assigned to a course and if this course increases its money earned correctly.
    @Test
    public void shouldEnrollStudent_AndUpdateMoneyEarned() {
        SchoolManagementSystem sms = new SchoolManagementSystem("Ironhack", lt, ls, lc);
        sms.enroll("S1","C1");
        sms.enroll("S2","C1");
        assertEquals(c1, sms.getStudentList().get(0).getCourse());
        assertEquals(4000, sms.getCourseList().get(0).getMoneyEarned());
    }

    //Testing method assignTeacher(), by checking if teacher is assigned to a course.
    @Test
    public void shouldAssignTeacher() {
        SchoolManagementSystem sms = new SchoolManagementSystem("Ironhack", lt, ls, lc);
        sms.assignTeacher("T1","C1");
        sms.assignTeacher("T2","C2");
        assertEquals(t1, sms.getCourseList().get(0).getTeacher());
        assertEquals(t2, sms.getCourseList().get(1).getTeacher());
    }

    //Testing methods lookUpCourseById(), lookUpStudentById(), lookUpTeacherById()
    @Test
    public void shouldLookUpElementsById() {
        SchoolManagementSystem sms = new SchoolManagementSystem("Ironhack", lt, ls, lc);
        assertEquals(c2, sms.lookUpCourseById("C2"));
        assertEquals(s2, sms.lookUpStudentById("S2"));
        assertEquals(t2, sms.lookUpTeacherById("T2"));
    }

    //Testing method showProfit(), considering it returns total money earned from all courses minus sum of teacher salaries
    @Test
    public void shouldShowProfitCorrectly() {
        SchoolManagementSystem sms = new SchoolManagementSystem("Ironhack", lt, ls, lc);
        sms.enroll("S1","C1");
        sms.enroll("S2","C2");
        assertEquals(1500,sms.showProfit());
    }

}
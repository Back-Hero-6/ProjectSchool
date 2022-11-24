package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //PASO 8
        runSchoolApp();
    }

    //FUNCTION 1: Metodo para meter el nombre de la escuela
    private static SchoolManagementSystem createSchool() {

        Scanner sc = new Scanner(System.in);
        //PASO 1: dar nombre a la escuela
        System.out.println("Enter the name of the school");
        String schoolName = sc.nextLine();

        //PASO 2: Escoger numero de profesores y poner sus detalles
        System.out.println("Enter the number of teachers to create");
        int numOfTeachers = sc.nextInt();
        //PASO 3:
        List<org.example.Teacher> teacherList = new ArrayList<>(numOfTeachers);
        for (int i = 1; i <= numOfTeachers; i++) {
            System.out.println("Enter the details of teacher " + i);
            System.out.println("Name for this teacher:");
            String teacherName = sc.next();
            System.out.println("Salary for this teacher:");
            double salary = sc.nextDouble();
            teacherList.add(new Teacher(teacherName, salary));
        }
        //PASO 4:
        System.out.println("Enter the number of courses to create");
        int numOfCourses = sc.nextInt();
        //PASO 5:
        List<org.example.Course> courseList = new ArrayList<>(numOfCourses);
        for (int i = 1; i <= numOfCourses; i++) {
            System.out.println("Enter the details of course " + i);
            System.out.println("Name for this course:");
            String courseName = sc.next();
            System.out.println("Price for this course:");
            double price = sc.nextDouble();
            courseList.add(new Course(courseName, price));
        }
        //PASO 6
        System.out.println("Enter the number of students to create");
        int numOfStudents = sc.nextInt();
        //PASO 7
        List<org.example.Student> studentList = new ArrayList<>(numOfStudents);
        for (int i = 1; i <= numOfStudents; i++) {
            System.out.println("Enter the details of student " + i);
            System.out.println("Name for this student:");
            String studentName = sc.next();
            System.out.println("Address for this student:");
            String address = sc.next();
            System.out.println("Email for this student:");
            sc.nextLine();
            String email = sc.nextLine();
            studentList.add(new Student(studentName, address, email));
        }
        SchoolManagementSystem school = new SchoolManagementSystem(schoolName, teacherList, studentList, courseList);
        return school;
    }


    //FUNCTION: Método para mostrar el menú de comandos disponibles
    private static void runSchoolApp() {
        //Initializing the SMS based on a newly created school object by calling createSchool():
        SchoolManagementSystem sms = createSchool();
        System.out.println("\n Accessing school database...");
        Scanner sc = new Scanner(System.in);
        showMenu();

        int option = 1;

        while (option != 0) {
            option = sc.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("Please introduce a Student ID to enroll");
                    String studentId = sc.next();
                    System.out.println("Please introduce a Course ID to enroll this student");
                    String courseId = sc.next();
                    //enroll student
                    sms.enroll(studentId, courseId);
                    System.out.println(studentId+" has been enrolled to "+courseId);
                    sc.nextLine();
                    showMenu();
                }
                break;
                case 2: {
                    System.out.println("Please introduce a Teacher ID to assign");
                    String teacherId = sc.next();
                    System.out.println("Please introduce a Course ID to enroll this student");
                    String courseId = sc.next();
                    //assign teacher
                    sms.assignTeacher(teacherId, courseId);
                    System.out.println(teacherId+" has been assigned to "+courseId);
                    sc.nextLine();
                    showMenu();
                }
                break;
                case 3: {
                    //show courses
                    System.out.println(sms.showCourses());
                    sc.nextLine();
                    showMenu();
                }
                break;
                case 4: {
                    System.out.println("Please introduce a Course ID to search for");
                    String courseId = sc.next();
                    System.out.println(sms.lookUpCourseById(courseId));
                    sc.nextLine();
                    showMenu();
                }
                break;
                case 5: {
                    //show students;
                    System.out.println(sms.showStudents());
                    sc.nextLine();
                    showMenu();
                }
                break;
                case 6: {
                    System.out.println("Please introduce a Student ID to search for");
                    String studentId = sc.next();
                    System.out.println(sms.lookUpStudentById(studentId));
                    sc.nextLine();
                    showMenu();
                }
                break;
                case 7: {
                    // show teachers;
                    System.out.println(sms.showTeachers());
                    sc.nextLine();
                    showMenu();
                }
                break;
                case 8: {
                    System.out.println("Please introduce a Teacher ID to search for");
                    String teacherId = sc.next();
                    System.out.println(sms.lookUpTeacherById(teacherId));
                    sc.nextLine();
                    showMenu();
                }
                break;
                case 9: {
                    System.out.println(sms.showProfit());
                    sc.nextLine();
                    showMenu();
                }
                break;
                case 0: {
                    System.out.println("GOODBYE!");
                   System.exit(1);
                }
                default: {
                    System.err.println("Select a correct option");
                    showMenu();
                    break;
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("MENU \n"
                + "1 ENROLL [STUDENT_ID] [COURSE_ID]:\n"
                + "2 ASSIGN [TEACHER_ID] [COURSE_ID]:\n"
                + "3 SHOW COURSES:\n"
                + "4 LOOKUP COURSE [COURSE_ID]:\n"
                + "5 SHOW STUDENTS:\n"
                + "6 LOOKUP STUDENT [STUDENT_ID]:\n"
                + "7 SHOW TEACHERS:\n"
                + "8 LOOKUP TEACHER [TEACHER_ID]:\n"
                + "9 SHOW PROFIT:\n"
                + "0 EXIT");
    }
}

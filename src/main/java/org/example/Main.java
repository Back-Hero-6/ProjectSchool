package org.example;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        //Creación de del objeto escuela
        createSchool();


        //PASO 8
        showMenuCommands();
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
            String email = sc.next();
            studentList.add(new Student(studentName, address, email));
        }

        SchoolManagementSystem school = new SchoolManagementSystem(String schoolName, List<Teacher> teacherList, List<Student> studentList, List<Course> courseList);
        return school;
    }

    //FUNCTION 2: Metodo para escoger el numero de profesores


    //FUNCTION: Método para mostrar el menú de comandos disponibles
    private static void showMenuCommands() {
        Scanner sc = new Scanner(System.in);
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
        int option = 1;

        while (option != 0) {
            option = sc.nextInt();
            switch (option) {
                case 1: {
                        enroll()


                    }
                }

                case 2: {
                    //assign()

                }
                case 3: {
                    showCourses();
                }
                case 4: {
                   // lookUpCourseById();
                }
                case 5: {
                    showStudents();
                }
                case 6: {
                   // lookUpStudentById();
                }
                case 7: {
                    showTeachers();
                }
                case 8: {
                    // lookUpTeacherById();
                }
                case 9: {

                }

                default: {
                    System.err.println("Select a correct option");
                    break;
                }
            }
        }

    public static void enroll(String studentId, String courseId) {
        Map<String, String> enrolled = new HashMap<>();
        enrolled.put(studentId, courseId);
        course.setMoneyEarned(course.getMoneyEarned + course.getPrice);
    }

    public static void showCourses() {
        school.getCourseList().toString();
    }

    public static void showStudents() {
        school.getStudentList().toString();
    }

    public static void showTeachers() {
        school.getTeacherList().toString();
    }

    public static void showProfit() {
        school.getProfit().toString();
    }


}
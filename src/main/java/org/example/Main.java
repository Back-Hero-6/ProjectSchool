package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Method to initialize a new school and use its application
        runSchoolApp();
    }

    //FUNCTION 1: Method to create school
    private static SchoolManagementSystem createSchool() {

        Scanner sc = new Scanner(System.in);
        //STEP 1: give the school a name
        System.out.println("Enter the name of the school");
        String schoolName = sc.nextLine();

        //STEP 2-3: Insert number if teachers and its details
        System.out.println("Enter the number of teachers to create");
        int numOfTeachers = sc.nextInt();
        List<org.example.Teacher> teacherList = new ArrayList<>(numOfTeachers);
        for (int i = 1; i <= numOfTeachers; i++) {
            System.out.println("Enter the details of teacher " + i);
            System.out.println("Name for this teacher:");
            String teacherName = sc.next();
            System.out.println("Salary for this teacher:");
            double salary = sc.nextDouble();
            teacherList.add(new Teacher(teacherName, salary));
        }
        //STEP 4-5: Insert number of courses and its details
        System.out.println("Enter the number of courses to create");
        int numOfCourses = sc.nextInt();
        List<org.example.Course> courseList = new ArrayList<>(numOfCourses);
        for (int i = 1; i <= numOfCourses; i++) {
            System.out.println("Enter the details of course " + i);
            System.out.println("Name for this course:");
            String courseName = sc.next();
            System.out.println("Price for this course:");
            double price = sc.nextDouble();
            courseList.add(new Course(courseName, price));
        }
        //STEP 6-7: Insert number of students and its details
        System.out.println("Enter the number of students to create");
        int numOfStudents = sc.nextInt();
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
        return new SchoolManagementSystem(schoolName, teacherList, studentList, courseList);
    }


    //MAIN FUNCTION: Method to run full application
    private static void runSchoolApp() {
        //Initializing the SMS to a new object school by calling the method createSchool():
        SchoolManagementSystem sms = createSchool();
        System.out.println("\n Accessing school database...");
        Scanner sc = new Scanner(System.in);

        int option = 1;

        while (option != 0) {
            showMenu();
            try {
                option = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException iM) {
                System.err.println("Please introduce an integer value");
                sc.nextLine();
            }

            switch (option) {
                case 1: {
                    System.out.println("Please introduce a Student ID to enroll");
                    String studentId = sc.next();
                    System.out.println("Please introduce a Course ID to enroll this student");
                    String courseId = sc.next();
                    //enroll student
                    sms.enroll(studentId, courseId);
                    System.out.println("\n" + studentId + " has been enrolled to " + courseId + "\n");
                    sc.nextLine();
                }
                break;
                case 2: {
                    System.out.println("Please introduce a Teacher ID to assign");
                    String teacherId = sc.next();
                    System.out.println("Please introduce a Course ID to enroll this student");
                    String courseId = sc.next();
                    //assign teacher
                    sms.assignTeacher(teacherId, courseId);
                    System.out.println("\n" + teacherId + " has been assigned to " + courseId + "\n");
                    sc.nextLine();
                }
                break;
                case 3: {
                    //show courses
                    System.out.println("\n" + sms.showCourses() + "\n");
                }
                break;
                case 4: {
                    System.out.println("Please introduce a Course ID to search for");
                    String courseId = sc.next();
                    System.out.println("\n" + sms.lookUpCourseById(courseId) + "\n");
                    sc.nextLine();
                }
                break;
                case 5: {
                    //show students;
                    System.out.println("\n" + sms.showStudents() + "\n");
                }
                break;
                case 6: {
                    System.out.println("Please introduce a Student ID to search for");
                    String studentId = sc.next();
                    System.out.println("\n" + sms.lookUpStudentById(studentId) + "\n");
                    sc.nextLine();
                }
                break;
                case 7: {
                    // show teachers;
                    System.out.println("\n" + sms.showTeachers() + "\n");
                }
                break;
                case 8: {
                    System.out.println("Please introduce a Teacher ID to search for");
                    String teacherId = sc.next();
                    System.out.println("\n" + sms.lookUpTeacherById(teacherId) + "\n");
                    sc.nextLine();
                }
                break;
                case 9: {
                    System.out.println("\n" + sms.showProfit() + "\n");
                }
                break;
                case 0: {
                    System.out.println("\n" + "GOODBYE!");
                    System.exit(1);
                }
                default: {
                    System.err.println("Select a valid option");
                }
            }
        }
    }

    //Method to show Menu commands.
    public static void showMenu() {
        System.out.println("""
                MENU\s
                1 ENROLL [STUDENT_ID] [COURSE_ID]:
                2 ASSIGN [TEACHER_ID] [COURSE_ID]:
                3 SHOW COURSES:
                4 LOOKUP COURSE [COURSE_ID]:
                5 SHOW STUDENTS:
                6 LOOKUP STUDENT [STUDENT_ID]:
                7 SHOW TEACHERS:
                8 LOOKUP TEACHER [TEACHER_ID]:
                9 SHOW PROFIT:
                0 EXIT""");
    }
}

package studentdatabaseapp;

import java.util.Scanner;

public class student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor to prompt student name and year

    public student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student's first name : ");
        this.firstName = in.nextLine();

        System.out.print("Enter student's last name : ");
        this.lastName = in.nextLine();

        System.out.print("Enter 1 - Freshmen\n2 - Sophmore\n3 - Junior\n4- - Senior\nEnter Student class level : ");
        this.gradeYear = in.nextInt();

        setstudentID();

        // System.out.println(firstName + " " + lastName + " " + gradeYear + " " +
        // studentID);

    }

    // Generate an ID
    private void setstudentID() {
        // Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop, user hit 0
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
        // System.out.println("ENROLLED IN: " + courses);

    }

    // View Balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay tution
    public void payTuition() {
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Status of student
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudentID: " + studentID
                + "\nCourses Enrolled:" + courses + "\nBalance: $" + tuitionBalance;
    }
}
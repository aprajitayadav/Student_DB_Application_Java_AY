package studentdatabaseapp;

import java.util.Scanner;

public class studentdatabasemain {
    public static void main(String[] args) {

        student stu1 = new student();
        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.toString());

        // Ask how many new students we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        student[] students = new student[numOfStudents];

        // create n number of new students
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());

        }

    }

}
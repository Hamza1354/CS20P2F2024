/*
Program: CourseGradesApp      Date: November 18, 2024

Purpose: the program alows the user to see their grades and get their avgs

Author: Hamza ismael, 
School: CHHS
Course: Computer Science 20
*/

package Mastery;

import java.util.Scanner;

public class CourseGrades1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        COURSE GB = new COURSE();

        // store grades and show them
        GB.getGrades();
        GB.showGrades();

        // show student average
        System.out.print("\nEnter student number (1-12) to see their average: ");
        int studentNumber = scanner.nextInt();
        System.out.println("Average grade for Student " + studentNumber + ": " + GB.student1(studentNumber));

        // show test average
        System.out.print("\nEnter test number (1-5) to see the average grade: ");
        int testNumber = scanner.nextInt();
        System.out.println("Average grade for Test " + testNumber + ": " + GB.test1(testNumber));

        
    }
}
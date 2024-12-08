/*
Program: CourseGradesApp      Date: November 18, 2024

Purpose: the programm alows the user to see their grades and get their avgs

Author: Hamza ismael, 
School: CHHS
Course: Computer Science 20
*/

package Mastery;

import java.util.Scanner;

public class CourseGradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main GB = new Main();

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
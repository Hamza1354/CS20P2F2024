package Mastery;

import java.util.Scanner;

public class COURSE {
    private final int number  = 12;
    private final int NUMBER = 5;
    private int[][] GRADES1 = new int[number][NUMBER];

    // Method to get grades from the user
    public void getGrades() {
        Scanner scanner = new Scanner(System.in);
        for (int num1 = 0; num1 < number; num1++) {
        	//ask the user for their grades
        	//make the the variable equal to 0 to start store proper
            System.out.println("Enter grades for Student " + (num1 + 1) + ":");
            for (int num = 0; num < NUMBER; num++) {
                System.out.print("Test " + (num + 1) + ": ");
                GRADES1[num1][num] = scanner.nextInt();
            }
        }
    }

    // Display all grades
    public void showGrades() {
        System.out.println("\nGrades for all students:");
        for (int num1 = 0; num1 < number; num1++) {
            System.out.print("Student " + (num1 + 1) + ": ");
            for (int num = 0; num < NUMBER; num++) {
                System.out.print(GRADES1[num1][num] + " ");
            }
            System.out.println();
        }
    }

    // get the student or test avg
    private double calculateAvg(int index, boolean isStudent) {
        int total = 0;
        if (isStudent) {
            for (int num = 0; num < NUMBER; num++) {
                total += GRADES1[index][num];
            }
            return (double) total / NUMBER;
        } else {
            for (int num1 = 0; num1 < number; num1++) {
                total += GRADES1[num1][index];
            }
            return (double) total / number;
        }
    }

    // method to get   student average
    public double student1(int studentNumber) {
        return calculateAvg(studentNumber - 1, true);
    }

    // method to get  test average
    public double test1(int testNumber) {
        return calculateAvg(testNumber - 1, false);
    }
}
/*
Program: EvensAndOdds      Date:  2024

Purpose: The random numbers between 0 and 90 are classified as odds and evens.

Author: Hamza Ismael
School: CHHS
Course: Computer Science 20
*/

package Mastery;

import java.util.Random;

public class EvensAndOdds {
    private static final int full_num = 25;
    private static final int max = 90; // Set max to 90

    // Method for generating numbers
    public int[] generateRandomNumbers() {
        Random random = new Random();
        int[] numbers = new int[full_num];

        // Get 25 numbers from 0 to 90
        for (int num = 0; num < full_num; num++) {
            numbers[num] = random.nextInt(max + 1); // Generate random number between 0 and 90
        }
        return numbers;
    }

    // Method to classify odd and even
    public String[] categorizeNumbers(int[] numbers) {
        StringBuilder evens = new StringBuilder();
        StringBuilder odds = new StringBuilder();

        for (int between_numbers : numbers) {
        	
            // Check if  odd or even
        	
            if (between_numbers % 2 == 0) {
                evens.append(between_numbers).append(" ");
            } else {
                odds.append(between_numbers).append(" ");
            }
        }
        return new String[]{evens.toString(), odds.toString()};
    }

    // Method to show results
    public void displayResults(String evens, String odds) {
        System.out.println("Even numbers: " + evens);
        System.out.println("Odd numbers: " + odds);
    }
}
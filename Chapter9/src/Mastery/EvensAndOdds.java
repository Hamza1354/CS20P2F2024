/*
Program: EvensAndOdds      Date: November 14, 2024

Purpose: the random numbers between 0 and 90 is classified between odds and evens

Author: Hamza ismael, 
School: CHHS
Course: Computer Science 20
*/

package Mastery;

import java.util.Random;

public class EvensAndOdds {
    private static final int full_num = 25;
    private static final int max = 100;

    // method for generating numbers
    public int[] generateRandomNumbers() {
        Random random = new Random();
        int[] numbers = new int[full_num];

        // get 25 number from 0 to 90
        
        for (int num = 0; num < full_num ; num++) {
            numbers[num] = random.nextInt(max); // Generate random number between 0 and 99
        }
        return numbers;
    }

    // method to classify  the numbers in odd and even
    
    public String[] categorizeNumbers(int[] numbers) {
        StringBuilder EVENS = new StringBuilder();
        StringBuilder ODDS = new StringBuilder();

        for (int between_numbers : numbers) {
        	
            // check if their odd or even
        	
            if (between_numbers % 2 == 0) {
            	EVENS.append(between_numbers).append(" ");
            } else {
            	ODDS.append(between_numbers).append(" ");
            }
        }
        return new String[]{EVENS.toString(), ODDS.toString()};
    }

    // Method to show results
    public void displayResults(String evens, String odds) {
        System.out.println("Even numbers: " + evens);
        System.out.println("Odd numbers: " + odds);
    }
}
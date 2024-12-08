/*
Program: PalindromeApp     Date: November 15, 2024

Purpose: This program serves as the user interface for the Palindrome class,
allowing users to check if a word or phrase is a palindrome.

Author: Hamza ismael, 
School: CHHS
Course: Computer Science 20
*/

package Mastery;

import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word or phrase
        System.out.print("Enter a word or phrase, and this program will identify if it's a palindrome: ");
        String input = scanner.nextLine();

        // Check if the string is a palindrome using the Palindrome class
        if (Palindrome.isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
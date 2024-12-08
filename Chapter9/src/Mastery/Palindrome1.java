/*
Program: Palindrome     Date: November 15, 2024

Purpose:the program helps user to figure out if its a Palindrome.

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

        // use the Palindrome class to check if the user response if it Palindrome
        
        if (Palindrome.isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
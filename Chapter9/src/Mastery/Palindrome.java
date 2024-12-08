package Mastery;

public class Palindrome {

    // Method to confirm if it a palindrome by having a string
	
    public static boolean isPalindrome(String string) {
    	
        // Remove non-alphabetic characters and convert to lowercase
    	
        string = string.replaceAll(" ", "").toLowerCase();

        int LEFT1 = 0;
        int RIGHT2 = string.length() - 1;

        while (LEFT1 < RIGHT2) {
        	
            // match the characters 
        	
            if (string.charAt(LEFT1) != string.charAt(RIGHT2)) {
            	
                return false;  // if not a palindrome than the program ends here
            }
            LEFT1++;
            RIGHT2--;
        }

        return true;  // the characters is a string so it's a palindrome
    }
}
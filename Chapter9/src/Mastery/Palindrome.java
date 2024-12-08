package Mastery;

public class Palindrome {

    // Method to confirm if it a  palindrome by having a string
	
    public static boolean isPalindrome(String string) {
    	
        // Remove non-alphabetic characters and convert to lowercase
    	
        string = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
        	
            // match the charactors 
        	
            if (string.charAt(left) != string.charAt(right)) {
            	
                return false;  // if not a palindrome than the program ends here
            }
            left++;
            right--;
        }

        return true;  // the characters is a string so it's a palindrome
    }
}
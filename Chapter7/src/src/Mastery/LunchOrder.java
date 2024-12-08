/*

Program: LunchOrder.java          Last Date of this Revision: Dec . 12, 2024

Purpose: An program that uses  for loops to output a table that displays number in 
 multiples of ten.

Author: Hamza ismael, 
School: CHHS
Course: Computer Science 20
 

*/

package src.Mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class LunchOrder {

    public static void main(String[] args) {
        
        // Create a new Scanner, 
    	// made Food, and Decimal Format object
    	
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        Food order = new Food();
        
        // Asking user for how many burgers, salads, fries, and sodas provided nutrition values for each
        System.out.print("Enter number of hamburgers: ");
        order.hamburger(input.nextInt(), 9, 33, 1);
        System.out.println("");
        
        System.out.print("Enter number of salads: ");
        order.salad(input.nextInt(), 1, 11, 5);
        System.out.println("");
        
        System.out.print("Enter number of french fries: ");
        order.frenchFries(input.nextInt(), 11, 36, 4);
        System.out.println("");
        
        System.out.print("Enter number of sodas: ");
        order.soda(input.nextInt(), 0, 38, 0);
        System.out.println("");
        
        // Outputs total amount of money user owes for the food by accessing it through total method
        System.out.println("Your order comes to: $" + formatter.format(order.total()));
        
        input.close(); // Close the scanner to prevent resource leaks
    }
}

/* Screen Dump

Test case 1:
Enter number of hamburgers: 2
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber

Enter number of salads: 2
Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber

Enter number of french fries: 2
Each serving of french fries has 11.0g of fat, 36.0g of carbs, and 4.0g of fiber

Enter number of sodas: 2
Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber

Your order comes to: $6.1


 */
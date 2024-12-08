/*

Program: DigitExtractor.java          Last Date of this Revision: Dec . 12, 2024

Purpose: DigitExtractor program that give  the user a  option for their  integer and then displays the ones,
tens, and hundreds digit of the number.

Author: Hamza ismael, 
School: CHHS
Course: Computer Science 20
 

*/

package src.Mastery;

import java.util.Scanner;

public class DigitExtractor {

	public static void main(String[] args) {
		// TODO method stub
		// new scanner object and number object by asking user for integer to use as parameter for number object constructor method
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		
		Num integer = new Num(Input.nextInt());
		
		// making variable for users choice on giving a  integer
		String choice;
		
		
		
		//while loop to give user option on classifying  integer 
		while (true) {
			//providing  user with 5 option on what to do with a integer
			System.out.println("Show (W)hole number.");
			System.out.println("Show (O)nes place number.");
			System.out.println("Show (T)ens place number.");
			System.out.println("Show (H)undreds place number.");
			System.out.println("(Q)uit");

			
			
			System.out.print("Enter your choice: ");
			//take in the  users choice 
			choice = Input.next();
			//make it  lower case for the user choice isn't case sensitive
			choice = choice.toLowerCase();
			//if they picked choice q then it will ends the program
			if (choice.equals("q")) {
				break;
			
			}
			
			
			// if they picked choice W,O,T, or H then the number that fit the requirement will be displayed
			
			
			switch (choice) {
			
			// choice W will output the whole integer
			
			case "w":System.out.println("your integer is " + integer.wholeNum()); break;
			
			//choice O accesses method which outputs ones places of number
			
			case "o": System.out.println("The ones place digit is: " + integer.onesPlace());  break;
			
			//choice T accesses method which outputs ten place of number
			
			case "t":System.out.println("The tens place digit is: " + integer.tensPlace());break;
			
			//choice H accesses method which outputs hundreds place of number
			
			case "h":System.out.println("The hundreds place digit is: " + integer.hundredsPlace()); break;
			
			//if user enters a choice that is not displayed then will tell user to try again
			
			default:System.out.println("You entered a invalid choice please try again");
			
			}
		}
	}
	}

/* Screen Dump

test case 1:
Enter an integer:456
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: w
your integer is 456
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: o
The ones place digit is: 6
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: t
The tens place digit is: 5
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: h
The hundreds place digit is: 4
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: 1
You entered a invalid choice please try again
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: q

test case 2:
Enter an integer: 768
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: w
your integer is 768
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: o
The ones place digit is: 8
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: t
The tens place digit is: 6
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: h
The hundreds place digit is: 7
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: 2
You entered a invalid choice please try again
Show (W)hole number.
Show (O)nes place number.
Show (T)ens place number.
Show (H)undreds place number.
(Q)uit
Enter your choice: q


 */
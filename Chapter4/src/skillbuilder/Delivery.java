package skillbuilder;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		
	
		
		Scanner userInput = new Scanner(System.in);
		
		
		
		
		System.out.println(" Please import your lenght of package:   ");
		double lenght = userInput.nextDouble();
		
		System.out.println(" Please import your width of package:   ");
		double width = userInput.nextDouble();;
		
		
		System.out.println(" Please import your height of package:   ");
		double height = userInput.nextDouble();
		
		
		boolean incorrect = false;
		
		if (lenght > 10 ) {
		  
			incorrect = true;
		
		}

		
		if (width > 10 ) {
			  
			incorrect = true;
			
			}
		
		
		if (height > 10 ) {
			  
			incorrect = true;
			
			}
	
		
		if (incorrect) {
            System.out.println(" lenght or width or height isn't following requirments");
            
        } else {
            System.out.println("Accept");
        }
		
		
		
	
	}
	
}

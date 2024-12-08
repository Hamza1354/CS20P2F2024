
package src.Mastery;
import java.text.DecimalFormat;
public class Bank {
	//bank variable which will store all the money the user has and adds
		private double balance;
		private DecimalFormat formatter = new DecimalFormat("#.##");
		//constructor method to create  bank giving bank a value of zero
		public Bank() {
			balance = 0;
		}
		//method will return value of bank as value of money in the  bank
		public double showBalance() {
			return Double.parseDouble(formatter.format(balance));
			
		}
		// method to place value on  penny to  bank
		public void addPenny() {
			balance += 0.01;
		}
		// method to add dollar value on a nickel to  bank
		public void addNickel() {
			balance += 0.05;
		}
		// method to place value on  a dime to  bank
		public void addDime() {
			balance += 0.10;
		}
		// method to place value on on a quarter to  bank
		public void addQuarter() {
			balance += 0.25;
		}
		// method to take out money from bank with a parameter of how much to take out
		
		public String takeMoney(double money) {
			//checking if balance of  bank has enough to take out how much money the user wants to
			if (balance >= money) {
				balance -= money;
				return ("Money has been taken out");
			} else {
				return("There is not enough money in the bank to take out that much");
			}
			
		}
}
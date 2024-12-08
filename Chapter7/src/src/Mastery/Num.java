package src.Mastery;

public class Num {
	//number variable which will put the integer of what the  user enters
	private int number;
	//constructor method to create num object with variable of number which equals the parameter needed to create object
	public Num (int integer) {
		number = integer;
	}
	//method brings back the number variable 
	public int wholeNum() {
		return number;
	}
	// method brings back  ones place of number
	public int onesPlace() {
		return number%10;
	}
	//method brings back tens place of number
	public int tensPlace() {
		return (number/10)%10;
	}
	// method brings back hundreds place of number
	public int hundredsPlace() {
		return (number/100)%10;
	}
	public String wholeNum1() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
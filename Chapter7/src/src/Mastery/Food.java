package src.Mastery;

public class Food {
    // Made price variable to keep track of total price of user's order
    private double price;
    
    // Constructor method which shows total price of the order to zero since nothing has been ordered yet
    public Food() {
        price = 0;
    }
    
    // Method which takes number of burgers, and grams of fat, carbs, and fiber a singular burger has
    public void hamburger(int numBurgers, double fat, double carbs, double fiber) {
    	
        // burgers are multiplied by  dollar value and puts it into price
    	
        price += (numBurgers * 1.85);
        // Takes fat, carbs, and fiber boundary and outputs the nutrition information of one burger
        System.out.println("Each hamburger has " + fat + "g of fat, " + carbs + "g of carbs, and " + fiber + "g of fiber");
    }
    
    // Method which stores number of salads, and grams of fat, carbs, and fiber a singular salad has
    public void salad(int numSalads, double fat, double carbs, double fiber) {
    	
        //  salads  multiplied by  dollar value and puts it into price
    	
        price += (numSalads * 2);
        
        // Takes fat, carbs, and fiber boundary and outputs the nutrition information of one salad
        
        System.out.println("Each salad has " + fat + "g of fat, " + carbs + "g of carbs, and " + fiber + "g of fiber");
    }
    
    // Method which takes number of french fries, and grams of fat, carbs, and fiber a single serving of french fries has 
    public void frenchFries(int numFries, double fat, double carbs, double fiber) {
    	
        // french fries    multiplied by  dollar value and puts it into price
    	
        price += (numFries * 1.3);
        // Takes fat, carbs, and fiber boundary and outputs the nutrition information of one serving of french fries
        System.out.println("Each serving of french fries has " + fat + "g of fat, " + carbs + "g of carbs, and " + fiber + "g of fiber");
    }
    
    // Method which takes number of sodas, and grams of fat, carbs, and fiber a singular soda has
    public void soda(int numSodas, double fat, double carbs, double fiber) {
    	
        // sodas    multiplied by  dollar value and puts it into price
    	
        price += (numSodas * 0.95);
        // Takes fat, carbs, and fiber parameters and outputs the nutrition information of a singular soda
        System.out.println("Each soda has " + fat + "g of fat, " + carbs + "g of carbs, and " + fiber + "g of fiber");
    }
    
    // Method which returns the price variable which holds the dollar value of the user's order
    public double total() {
        return price;
    }
}
package Mastery;

public class EvensAndOdds1 {
    public static void main(String[] args) {
        EvensAndOdds evensAndOdds = new EvensAndOdds();
        
     // Generate random numbers
        
        int[] numbers = evensAndOdds.generateRandomNumbers(); 
        
     // show numbers
        String[] categorizedNumbers = evensAndOdds.categorizeNumbers(numbers); 
        
     // show results
        evensAndOdds.displayResults(categorizedNumbers[0], categorizedNumbers[1]); 
    }
}
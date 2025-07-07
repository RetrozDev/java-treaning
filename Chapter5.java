public class Chapter5 {
    public static void run() {
        Console.info("=== Chapter 5: Functions ===");
        
        // Math functions demonstration
        demonstrateMathFunctions();
        

        
        Console.info("");
    }
    
    private static void demonstrateMathFunctions() {
        int result = Math.add(5, 10);
        Console.log("Sum of 5 and 10 is: " + result);
        
        int[] numbersArray = { 1, 2, 3, 4, 5 };
        int sumOfArray = Math.sumArray(numbersArray);
        Console.log("Sum of array: " + sumOfArray);
    }

}

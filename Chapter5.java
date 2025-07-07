public class Chapter5 {
    public static void run() {
        Console.info("=== Chapter 5: Functions ===");
        
        // Math functions demonstration
        demonstrateMathFunctions();
        
        // Console methods testing
        demonstrateConsoleMethods();
        
        Console.info("");
    }
    
    private static void demonstrateMathFunctions() {
        int result = Math.add(5, 10);
        Console.log("Sum of 5 and 10 is: " + result);
        
        int[] numbersArray = { 1, 2, 3, 4, 5 };
        int sumOfArray = Math.sumArray(numbersArray);
        Console.log("Sum of array: " + sumOfArray);
    }
    
    private static void demonstrateConsoleMethods() {
        Console.log("Testing all Console methods:");
        Console.log("Operation successful");
        Console.error("An error has occurred");
        Console.warn("Be careful with this parameter");
        Console.info("General information");
        Console.success("Processing completed successfully");
    }
}

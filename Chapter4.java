public class Chapter4 {
    public static void run() {
        Console.info("=== Chapter 4: Loops ===");
        
        // Different types of loops
        demonstrateForLoop();
        demonstrateEnhancedForLoop();
        demonstrateArraySum();
        demonstrateWhileLoop();
        demonstrateDoWhileLoop();
        
        Console.info("");
    }
    
    private static void demonstrateForLoop() {
        Console.log("Simple for loop:");
        for (int i = 0; i < 5; i++) {
            Console.log("Loop iteration: " + i);
        }
    }
    
    private static void demonstrateEnhancedForLoop() {
        Console.log("Enhanced for loop:");
        String[] fruits = { "Apple", "Banana", "Cherry" };
        for (String fruit : fruits) {
            Console.log("Fruit: " + fruit);
        }
    }
    
    private static void demonstrateArraySum() {
        Console.log("Array sum with for loop:");
        int[] numbers = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        Console.log("Sum of numbers: " + sum);
    }
    
    private static void demonstrateWhileLoop() {
        Console.log("While loop:");
        int userAge = 10;
        while (userAge < 18) {
            Console.warn("User is under 18, current age: " + userAge);
            userAge++;
        }
    }
    
    private static void demonstrateDoWhileLoop() {
        Console.log("Do-while loop:");
        int userAge = 18; // Starting from 18 after the while loop
        do {
            Console.warn("User is still under 21 he can't drink alcohol, current age: " + userAge);
            userAge++;
        } while (userAge < 21);
    }
}

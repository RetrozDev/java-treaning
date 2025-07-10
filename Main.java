public class Main {

    public static void main(String[] args) {
        Console.info("=== Java Learning Program ===");
        Console.success("Starting all chapters...");
        Console.info("");
        
        // Run all chapters in sequence
        Chapter0.run(); // Introduction
        Chapter1.run(); // Variables and Data Types
        Chapter2.run(); // Conditional Statements
        Chapter3.run(); // Arrays
        Chapter4.run(); // Loops
        Chapter5.run(); // Functions
        Chapter6.run(); // Objects
        Chapter7.run(); // Inheritance
        Chapter8.run(); // Enum
        Chapter9.run(); // Arraylist
        Chapter10.run(); // HashMap
        Chapter11.run(); // Exception Handling
        Chapter12.run(); // Chronometer
        
        Console.success("All chapters completed successfully!");
    }

}

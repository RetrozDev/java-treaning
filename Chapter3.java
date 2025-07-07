public class Chapter3 {
    public static void run() {
        Console.info("=== Chapter 3: Arrays ===");
        
        // Simple array operations
        demonstrateBasicArrays();
        
        // Array calculations
        demonstrateArrayCalculations();
        
        // Multi-dimensional arrays
        demonstrateMultiDimensionalArrays();
        
        // String splitting
        demonstrateStringSplitting();
        
        Console.info("");
    }
    
    private static void demonstrateBasicArrays() {
        String[] names = { "Alice", "Bob", "Charlie" };
        Console.log("First name: " + names[0]); // Expecting "Alice"
        names[1] = "David"; // Changing Bob to David
        Console.log("Modified second name: " + names[1]);
    }
    
    private static void demonstrateArrayCalculations() {
        int[] notes = { 85, 90, 78, 92 };
        int averageNote = (notes[0] + notes[1] + notes[2] + notes[3]) / notes.length;
        Console.log("The average note is: " + averageNote);
    }
    
    private static void demonstrateMultiDimensionalArrays() {
        int[][] studentsNotes = {
                { 52, 85, 90 },
                { 68, 78, 92 },
                { 79, 88, 84 }
        };
        Console.log("Student 1's first note: " + studentsNotes[0][0]);
        Console.log("Student 2's first note: " + studentsNotes[1][0]);
        Console.log("Student 3's first note: " + studentsNotes[2][0]);
    }
    
    private static void demonstrateStringSplitting() {
        String userNames = "user123,user456,user789";
        String[] userNamesArray = userNames.split(",");
        Console.log("First user: " + userNamesArray[0]); // Expecting "user123"
        Console.log("Second user: " + userNamesArray[1]); // Expecting "user456"
    }
}

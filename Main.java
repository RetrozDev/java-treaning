public class Main {

    public static void main(String[] args) {
        Console.info("=== Java Learning Program ===");
        Console.success("Starting all chapters...");
        Console.info("");
        
        // Run all chapters in sequence
        Chapter0.run();
        Chapter1.run();
        Chapter2.run();
        Chapter3.run();
        Chapter4.run();
        Chapter5.run();
        Chapter6.run();
        Chapter7.run();
        
        Console.success("All chapters completed successfully!");
    }

}

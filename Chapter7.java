public class Chapter7 {
    public static void run() {
        Console.info("=== Chapter 7: Inheritance ===");
        // Create a fruit object
        Fruit apple = new Apple();
        // Display apple properties
        apple.displayInfo();
        // Taste the apple
        apple.taste();


        // Create a pineapple object
        Fruit pineapple = new Pineapple();
        // Display pineapple properties
        pineapple.displayInfo();
        // Taste the pineapple
        pineapple.taste();
    }
}

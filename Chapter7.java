public class Chapter7 {
    public static void run() {
        Console.info("=== Chapter 7: Inheritance ===");
        // Create a fruit object
        Fruit apple = new Apple();
        // Display apple properties
        apple.displayInfo();
        // Taste the apple
        apple.taste();

        if (apple instanceof PeelFruit) {
            Console.log("This fruit can be peeled.");
        } else {
            Console.log("This fruit cannot be peeled.");
        }

        // Create a pineapple object
        Fruit pineapple = new Pineapple();
        // Display pineapple properties
        pineapple.displayInfo();
        // Taste the pineapple
        pineapple.taste();
        
        if (pineapple instanceof PeelFruit) {
            Console.log("This fruit can be peeled.");
        } else {
            Console.log("This fruit cannot be peeled.");
        }
    }
}

public class Chapter11 {
    public static void run() {
        Console.info("=== Chapter 11: Exception Handling ===");
        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println(numbers[0]); // Accessing the first element
        try {
            System.out.println(numbers[5]); // This will throw an ArrayIndexOutOfBoundsException
            int calcul = 5 / 0; // This will throw an ArithmeticException
            System.out.println("Calculation result: " + calcul);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException error) {
            Console.error("Error is here: " + error.getMessage());
        } finally {
            Console.success("Finally block executed, cleaning up resources if needed.");
        }

        double balance = 1000.0;
        double price = 1200.0;
        buy(balance, price);
    }

    private static void buy(double balance, double price) {
        double newBalance = balance - price;
        System.out.println("Balance after purchase: " + newBalance); // This will not throw an exception, but let's
                                                                     // assume we want to check for negative balance
        if (newBalance < 0) {
            try {
                throw new IllegalArgumentException("Insufficient balance for the purchase. You too poor! lol");
            } catch (IllegalArgumentException error) {
                Console.error("Error: " + error.getMessage());
            }
        } else {
            Console.success("Purchase successful! New balance: " + newBalance);
        }
    }
}

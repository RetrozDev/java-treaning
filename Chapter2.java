public class Chapter2 {
    public static void run() {
        Console.info("=== Chapter 2: Conditional Statements ===");
        
        // Money and phone example
        demonstrateIfElse();
        
        // Day of week example
        demonstrateSwitch();
        
        Console.info("");
    }
    
    private static void demonstrateIfElse() {
        int money = 2000;
        int phonePrice = 1500;
        
        if (money >= phonePrice) {
            Console.success("I can buy the phone.");
        } else {
            Console.warn("I cannot afford the phone.");
        }

        money -= phonePrice; // Deducting phone price from money
        Console.log("After buying the phone, I have " + money + " left.");
    }
    
    private static void demonstrateSwitch() {
        int day = 3; // Let's say it's Wednesday
        switch (day) {
            case 1 -> Console.log("It's Monday.");
            case 2 -> Console.log("It's Tuesday.");
            case 3 -> Console.log("It's Wednesday.");
            case 4 -> Console.log("It's Thursday.");
            case 5 -> Console.log("It's Friday.");
            case 6 -> Console.log("It's Saturday.");
            case 7 -> Console.log("It's Sunday.");
            default -> Console.error("Invalid day.");
        }
    }
}

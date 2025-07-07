public class Chapter1 {
    public static void run() {
        Console.info("=== Chapter 1: Variables and Data Types ===");
        byte myAge = 25;
        int myAgeInMonths = 25 * 12;
        String myName = "John Doe";
        Console.log("My name is " + myName + " and I am " + myAge + " years old. In months, that's "
                + myAgeInMonths + " months.");
        myAge += 5; // Incrementing age by 5 years
        Console.log("After 5 years, I will be " + myAge);
        Console.info("");
    }
}

public class Main {

    public static void main(String[] args) {
        // Chapter 0: Introduction
        System.out.println("=== Chapter 0: Introduction ===");
        System.out.println("Hello, World! This is a Java program.");
        System.out.println();

        // Chapter 1: Variables and Data Types
        System.out.println("=== Chapter 1: Variables and Data Types ===");
        byte myAge = 25;
        int myAgeInMonths = 25 * 12;
        String myName = "John Doe";
        System.out.println("My name is " + myName + " and I am " + myAge + " years old. In months, that's "
                + myAgeInMonths + " months.");
        myAge += 5; // Incrementing age by 5 years
        System.out.println("After 5 years, I will be " + myAge);
        System.out.println();

        // Chatper 2 : Conditional Statements
        System.out.println("=== Chapter 2: Conditional Statements ===");
        int money = 2000;
        int phonePrice = 1500;
        if (money >= phonePrice) {
            System.out.println("I can buy the phone.");
        } else {
            System.out.println("I cannot afford the phone.");
        }

        money -= phonePrice; // Deducting phone price from money
        System.out.println("After buying the phone, I have " + money + " left.");
        int day = 3; // Let's say it's Wednesday
        switch(day) {
            case 1 -> System.out.println("It's Monday.");
            case 2 -> System.out.println("It's Tuesday.");
            case 3 -> System.out.println("It's Wednesday.");
            case 4 -> System.out.println("It's Thursday.");
            case 5 -> System.out.println("It's Friday.");
            case 6 -> System.out.println("It's Saturday.");
            case 7 -> System.out.println("It's Sunday.");
            default -> System.out.println("Invalid day.");
        }
        System.out.println();

        // Chapter 3: Arrays
        System.out.println("=== Chapter 3: Arrays ===");
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println(names[0]); // Expecting "Alice"
        names[1] = "David"; // Changing Bob to David

        int[] notes = {85, 90, 78, 92};
        int  averageNote = (notes[0] + notes[1] + notes[2] + notes[3]) / notes.length;
        System.out.println("The average note is: " + averageNote);

        int[][] studentsNotes = {
            {52, 85, 90},
            {68, 78, 92},
            {79, 88, 84}
        };
        System.out.println("Student 1's first note: " + studentsNotes[0][0]);
        System.out.println("Student 2's first note: " + studentsNotes[1][0]);
        System.out.println("Student 3's first note: " + studentsNotes[2][0]);

        String userNames = "user123,user456,user789";
        String[] userNamesArray = userNames.split(",");
        System.out.println(userNamesArray[0]); // Expecting "user123"
        System.out.println(userNamesArray[1]); // Expecting "user456"
        System.out.println();

        // Chapter 4: Loops
        System.out.println("=== Chapter 4: Loops ===");
        for (int i = 0; i < 5; i++) { // Simple for loop 
            System.out.println("Loop iteration: " + i);
        }
        
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) { // Enhanced for loop
            System.out.println("Fruit: " + fruit);
        }
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) { // for loop with sum
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        int userAge = 10;
        while (userAge < 18) { // While loop
            System.out.println("User is under 18, current age: " + userAge);
            userAge++;
        }

        do {
            System.out.println("User is still under 21 he can't drink alcohol, \ncurrent age: " + userAge);
            userAge++;
        } while (userAge < 21); // Do-while loop
  
    }
}

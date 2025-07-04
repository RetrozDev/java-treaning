
public class Main {

    public static void main(String[] args) {
        // Chapter 0: Introduction
        System.out.println("Hello, World! This is a Java program. \n\n");

        // Chapter 1: Variables and Data Types
        byte myAge = 25;
        int myAgeInMonths = 25 * 12;
        String myName = "John Doe";
        System.out.println("My name is " + myName + " and I am " + myAge + " years old. In months, that's "
                + myAgeInMonths + " months.\n\n");
        myAge += 5; // Incrementing age by 5 years
        System.out.println("After 5 years, I will be " + myAge);

        // Chatper 2 : Conditional Statements
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
    }
}

import java.util.ArrayList;

public class Chapter9 {
    public static void run() {
        Console.info("=== Chapter 9: ArrayList ===");
        // Create an ArrayList of Strings
        ArrayList<String> users = new ArrayList<>();
        // Add some users to the ArrayList
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        users.add(3,"Diana");
        // Display the users in the ArrayList
        Console.info("Users: " + users);
        // remove a user from the ArrayList
        users.remove("Bob");
        // Display the users after removal
        Console.info("Users after removal: " + users);
        // Check if a user exists in the ArrayList
        if (users.contains("Alice")) {
            Console.info("Alice is in the list.");
        } else {
            Console.warn("Alice is not in the list.");
        }
        Console.info("");
    }
}

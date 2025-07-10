import java.util.HashMap;
import java.util.Map;

public class Chapter10 {
    public static void run() {
        Console.info("=== Chapter 10: HashMap ===");
        Map<String, Integer> ages = new HashMap<>();

        // Adding key-value pairs to the HashMap
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);

        // Displaying the HashMap
        Console.info("Ages: " + ages);

        // Retrieving a value by key
        Integer aliceAge = ages.get("Alice");
        Console.info("Alice's age: " + aliceAge);

        // Removeing a key-value pair after checking if the key exists
        if (ages.containsKey("Bob")) {
            Console.info("Bob's age exists, removing Bob.");
            ages.remove("Bob");
            Console.info("After removing Bob: " + ages);
        } else {
            Console.info("Bob's age does not exist.");
        }

        // Print all keys and values in the HashMap
        int averageAge = 0;
        Console.info("Current ages in the HashMap:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            Console.info("Name: " + entry.getKey() + ", Age: " + entry.getValue());
            averageAge += entry.getValue();

        }
        averageAge = averageAge / ages.size();
        Console.info("Average age: " + averageAge);
    }
}

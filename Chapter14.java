public class Chapter14 {
    public static void run() {
        Console.info("=== Chapter 14: Callbacks ===");
        
        // Example 1: Callback with success
        Console.info("\n--- Example 1: Callback Success ---");
        executeCallback(new Callback() {
            @Override
            public void onSuccess(String message) {
                Console.success("✓ Success: " + message);
            }

            @Override
            public void onError(String error) {
                Console.error("✗ Error: " + error);
            }
        });
        
        // Example 2: Callback with an internal class
        Console.info("\n--- Example 2: Custom Callback ---");
        executeCallback(new CustomCallback());
        
        // Example 3: Callback with simulated error handling
        Console.info("\n--- Example 3: Callback with simulated error ---");
        executeCallbackWithError(new Callback() {
            @Override
            public void onSuccess(String message) {
                Console.success("✓ Success: " + message);
            }

            @Override
            public void onError(String error) {
                Console.error("✗ Error detected: " + error);
            }
        });
    }
    public static void executeCallback(Callback callback) {
        try {
            // Simulate some processing
            String result = "Operation completed successfully!";
            // Notify success
            callback.onSuccess(result);
        } catch (Exception e) {
            // Notify error
            callback.onError("An error occurred: " + e.getMessage());
        }
    }
    // Method to simulate an error
    public static void executeCallbackWithError(Callback callback) {
        try {
            // Simulate an error
            throw new RuntimeException("Simulated error for demonstration");
        } catch (RuntimeException e) {
            // Notify error
            callback.onError("An error occurred: " + e.getMessage());
        }
    }
    
    // Internal class for custom callback example
    static class CustomCallback implements Callback {
        @Override
        public void onSuccess(String message) {
            Console.success(" Custom Callback - Success: " + message);
        }

        @Override
        public void onError(String error) {
            Console.error(" Custom Callback - Error: " + error);
        }
    }
    
    public interface Callback {
        void onSuccess(String message);
        void onError(String error);
    }

    public static void main(String[] args) {
        run();
        executeCallback(new Callback() {
            @Override
            public void onSuccess(String message) {
                Console.success("Callback Success: " + message);
            }

            @Override
            public void onError(String error) {
                Console.error("Callback Error: " + error);
            }
        });
    }
}

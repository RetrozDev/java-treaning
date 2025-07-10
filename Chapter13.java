
import java.io.File;
import java.io.IOException;

public class Chapter13 {
    // Chapter 13: File Operations
    public static void run() {
        Console.info("=== Chapter 13: File Operations ===");
        File exampleDirectory = new File("exampleDir");
        File exampleTextFile = new File("exampleDir/example.txt");
        Console.info("Creating directory and file...");
        // Create directory first, then file, then write to it
        createDirectory(exampleDirectory);
        createFile(exampleTextFile);
        // write in the file
        writeFile(exampleTextFile, "Hello, this is a test file created in Chapter 13!");
    }

    private static void createFile(File file) {
        try {
            if (file.createNewFile()) {
                Console.success("File created: " + file.getName());
            } else {
                Console.warn("File already exists.");
            }
        } catch (IOException e) {
            Console.error("An error occurred while creating the file: " + e.getMessage());
        }
    }

    private static void createDirectory(File directory) {
        if (directory.mkdir()) {
            Console.success("Directory created: " + directory.getName());
        } else {
            Console.warn("Directory already exists or could not be created.");
        }
    }

    // Write in the file 
    private static void writeFile(File file, String content) {
        try (java.io.FileWriter writer = new java.io.FileWriter(file)) {
            writer.write(content);
            Console.success("Content written to file: " + file.getName());
        } catch (IOException e) {
            Console.error("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}

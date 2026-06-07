package Week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputOutputOperations {

    public static void convertFileToUppercase(String sourcePath, String destinationPath) {
        System.out.println("Initializing file conversion process...");
        System.out.println("Source: " + sourcePath);
        System.out.println("Destination: " + destinationPath);

        // Managing both reader and writer resources in a single block
        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationPath))) {

            String line;
            int lineCount = 0;

            // Read line by line until reaching the end of the file
            while ((line = reader.readLine()) != null) {
                // Convert to uppercase and write out
                writer.write(line.toUpperCase());
                // Add a platform-independent newline character
                writer.newLine(); 
                lineCount++;
            }

            System.out.println("\nSuccess! Process complete. Total lines processed: " + lineCount);

        } catch (FileNotFoundException e) {
            System.err.println("\nError: The source file could not be found.");
            System.err.println("Details: " + e.getMessage());

        } catch (IOException e) {
            System.err.println("\nError: An I/O error occurred during read/write operations.");
            System.err.println("Details: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output_uppercase.txt";

        // Execution run
        convertFileToUppercase(inputFileName, outputFileName);
    }
}
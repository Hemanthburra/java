package basic_syntax;

//import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileWritingDemo {

    public static void main(String[] args) {
        String filePath = "sample.txt";
//        String outputPath = "output.txt";

        // Writing to file using FileOutputStream
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            String content = "Hello, World with FileOutputStream!";
            fos.write(content.getBytes()); 
            // Convert string to bytes and write to file
            System.out.println("Written to file using FileOutputStream.");
        } catch (IOException e) {
            System.err.println("Error writing to file using FileOutputStream");
            e.printStackTrace();
        }

        // Writing to file using FileWriter
        try (FileWriter fw = new FileWriter(filePath, true)) {
            fw.write("\nHello, World with FileWriter!"); // Append to file
            System.out.println("Written to file using FileWriter.");
        } catch (IOException e) {
            System.err.println("Error writing to file using FileWriter");
            e.printStackTrace();
        }

        // Writing to file using BufferedWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write("\nHello, World with BufferedWriter!"); // Append to file
            System.out.println("Written to file using BufferedWriter.");
        } catch (IOException e) {
            System.err.println("Error writing to file using BufferedWriter");
            e.printStackTrace();
        }

        // Optionally, read the file after writing to check the results
        System.out.println("File content after writing:");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file after writing");
            e.printStackTrace();
        }
        
//        file output:
//        Hello, World with FileOutputStream!
//        Hello, World with FileWriter!
//        Hello, World with BufferedWriter!
        
//        Written to file using FileOutputStream.
//        Written to file using FileWriter.
//        Written to file using BufferedWriter.
//        File content after writing:
//        Hello, World with FileOutputStream!
//        Hello, World with FileWriter!
//        Hello, World with BufferedWriter!

    }
}

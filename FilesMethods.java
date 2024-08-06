package basic_syntax;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class FilesMethods {

    public static void main(String[] args) throws IOException {
        String filePath = "sample.txt";
        
        File file = new File(filePath);
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }

        // Reading from file using FileInputStream
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int content;
            System.out.println("Reading using FileInputStream:");
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error reading from file using FileInputStream");
            e.printStackTrace();
        }

        // Reading from file using Scanner
        try (Scanner scanner = new Scanner(new File(filePath))) {
            System.out.println("Reading using Scanner:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.err.println("Error reading from file using Scanner");
            e.printStackTrace();
        }

        // Reading from file using FileReader
        try (FileReader fr = new FileReader(filePath)) {
            int content;
            System.out.println("Reading using FileReader:");
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error reading from file using FileReader");
            e.printStackTrace();
        }

        // Reading from file using BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Reading using BufferedReader:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file using BufferedReader");
            e.printStackTrace();
        }
//        file matter:
//        Hello, World with FileOutputStream!
//        Hello, World with FileWriter!
//        Hello, World with BufferedWriter!
        
//        output using different readers:
//        File already exists.
//        Reading using FileInputStream:
//        Hello, World with FileOutputStream!
//        Hello, World with FileWriter!
//        Hello, World with BufferedWriter!
//        Reading using Scanner:
//        Hello, World with FileOutputStream!
//        Hello, World with FileWriter!
//        Hello, World with BufferedWriter!
//        Reading using FileReader:
//        Hello, World with FileOutputStream!
//        Hello, World with FileWriter!
//        Hello, World with BufferedWriter!
//        Reading using BufferedReader:
//        Hello, World with FileOutputStream!
//        Hello, World with FileWriter!
//        Hello, World with BufferedWriter!

    }
}

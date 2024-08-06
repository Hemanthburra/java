package basic_syntax;

import java.io.File;
import java.io.IOException;

public class Files_Folders {

    public static void main(String[] args) {
        try {
            // Example of creating a file
            File file = new File("sample.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Example of checking file properties
            System.out.println("File exists: " + file.exists());
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
            System.out.println("Is hidden: " + file.isHidden());

            // Example of setting file writable
            file.setWritable(true);
            System.out.println("Can write after setting: " + file.canWrite());

            // Creating directories
            File directory = new File("myDir/subDir");
            if (directory.mkdirs()) {
                System.out.println("Directories created: " + directory.getPath());
            } else {
                System.out.println("Directories already exist or failed to create.");
            }

            // List files in the directory
            File dir = new File("myDir");
            if (dir.isDirectory()) {
                String[] files = dir.list();
                if (files != null) {
                    for (String s : files) {
                        System.out.println(s);
                    }
                } else {
                    System.out.println("Directory is empty or could not be read.");
                }
            }

            // Deleting the file
            if (file.delete()) {
                System.out.println("File deleted.");
            } else {
                System.out.println("Failed to delete the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

package org.example;
import java.util.Scanner;

public class UserPrompt {
    public String[] dataPdf() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter the file path: ");
            String filePath = scanner.nextLine();

            System.out.println("Please enter a name for the file: ");
            String outputFile = scanner.nextLine();

            System.out.println("Please type the script in javascript: ");
            String script = scanner.nextLine();

            scanner.close();

            return new String[]{filePath, outputFile, script};
    }
}

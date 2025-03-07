package ProcessingFilesExpHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadUserFile {
    public static void main(String[] args) {

        try {
            File file = new File("user1.txt");
            Scanner input = new Scanner(file);
            while (input.hasNextLine()){
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}

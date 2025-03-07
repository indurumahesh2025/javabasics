package ProcessingFilesBufferReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TryWithResourcesAndAutoClosable {
    // This class implements AutoCloseable interface
    // and overrides close() method
    // This class is used in try-with-resources block
    // to automatically close the resources
    // No need to close the resources in finally block

    public static void main(String[] args) {
        File file = new File("user.txt");

        //try-with-resources block
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        // No need to close the resources in finally block
    }
}

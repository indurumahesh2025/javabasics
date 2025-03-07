package ProcessingFilesBufferReader;

//Import all the necessary classes from the Java IO package
import java.io.*;

public class ReadFileBufferedReader {
    public static void main(String[] args) {
        // Read a file using BufferedReader
        // BufferedReader is more efficient than Scanner
        // BufferedReader reads a line at a time
        // Scanner reads a word at a time
        // BufferedReader is a bit faster than Scanner
        // BufferedReader is used for reading large files
        // Scanner is used for reading user input
        // BufferedReader is not used for reading user input
        // BufferedReader is used for reading files
        // BufferedReader is used for reading large files


        File file = new File("user.txt");
        //define a BufferedReader object to globally
        // access it with null value and close it in finally block
        BufferedReader bufferedReader = null;
        //define a FileReader object to globally
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            // Read a line from the file
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
           System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem reading the file: " + file.getName());
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Unable to close the file");
            }
        }

    }
}

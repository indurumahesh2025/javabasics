package java_basics;

public class LearningArrays {
    public static void main(String[] args) {
        // Declare an array of integers
        int values[] = new int[3];
        values[0] = 10;
        values[1] = 20;
        System.out.println(values[2]);

        // Declare and initialize an array in one line
        String words[] = new String[] {"Hello", "World", "Java"};
        System.out.println(words[1]);

        // Declare and initialize an array in one line another way
        String names[] = new String[3];
        names[0] = "John";
        names[1] = "Doe";
        System.out.println(names[1]);

        // Now names is an array of 10 elements. All elements are null
        names = new String[10];


    }
}

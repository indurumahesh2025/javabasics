package ProcessingFilesExpHandling;

import java.util.Scanner;

public class ReadUserData {
    public static void main(String[] args) {

        /* Read user input from the console */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Your Name is " + name + ", Your Age is " + age + ", Your Salary is " + salary);
    }
}

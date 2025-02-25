package oops_basics;

//This is one way of creating an object of the Human class using the new keyword
//Another way is to create a constructor with parameters shown in the zoo example

public class Earth {
    public static void main(String[] args) {

        Human tom;
        // Create an object of the Human class
        tom = new Human();
        tom.age = 5;
        tom.eyeColor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom Zsabo";
        // Call the speak method from the Human class
        tom.speak();



        // Create another object of the Human class
        Human joe = new Human();
        joe.age = 36;
        joe.eyeColor = "green";
        joe.heightInInches = 68;
        joe.name = "Joe Smith";
        // Call the speak method from the Human class
        joe.speak();
    }
}

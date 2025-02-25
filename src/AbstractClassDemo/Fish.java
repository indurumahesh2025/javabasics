package AbstractClassDemo;

public class Fish extends Animal {
    //constructor
    public Fish(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    //abstract method implementation from Animal class
    public void move() {
        System.out.println("Fish is swimming...");
    }
}

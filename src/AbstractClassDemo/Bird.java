package AbstractClassDemo;

public class Bird extends Animal {
    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    //abstract method implementation from Animal class
    public void move() {
        System.out.println("Bird flapping wings...");
    }
}

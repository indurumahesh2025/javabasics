package InheritanceDemo;

//Bird is a sub class or child class of Animal
public class Bird extends Animal {

    //Bird constructor should have the same parameters as Animal constructor
    //Because bird is a child class of Animal
    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    public void fly() {
        System.out.println("Flying from bird...");
    }
}

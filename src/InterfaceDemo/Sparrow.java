package InterfaceDemo;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(int age, String gender1, int weightInLbs) {
        super(age, gender1, weightInLbs);
    }

    //Better way to override the method is implementing the interface
    public void fly() {
        System.out.println("Sparrow flying...");
    }
}

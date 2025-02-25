package InterfaceDemo;

public class Chicken extends Bird{
    public Chicken(int age, String gender1, int weightInLbs) {
        super(age, gender1, weightInLbs);
    }

    //method overriding from Bird class
    public void fly() {
        System.out.println("not able to fly...");
    }
}

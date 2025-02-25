package InterfaceDemo;

import oops_basics.Animal;

public class Bird extends Animal {
    public Bird(int age, String gender1, int weightInLbs) {
        super(age, gender1, weightInLbs);
    }

    public void fly() {
        System.out.println("flying...");
    }

}

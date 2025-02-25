package InheritanceDemo;

//Animal is a super class or parent class
public class Animal {

    int age;
    String gender;
    int weightInLbs;

    public  Animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    public void eat() {
        System.out.println("Eating from animal...");
    }
}

package AbstractClassDemo;

//abstract class can have abstract methods and concrete methods
public abstract class Animal {
     int age;
     String gender;
     int weightInLbs;

    public Animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
}

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    //abstract method to be implemented by the child class
    public abstract void move();


}

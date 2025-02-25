package oops_basics;


public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal(12, "M", 23);
        animal1.eat();
        animal1.sleep();

        Animal animal2 = new Animal(10, "F", 20);
        animal2.eat();
        animal2.sleep();

        Bird bird1 = new Bird();
        bird1.fly();
    }


}

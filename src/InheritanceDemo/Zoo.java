package InheritanceDemo;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal(12, "M", 23);
        animal1.eat();

        Bird bird1 = new Bird(3, "F", 10);
        bird1.fly();

        Fish fish1 = new Fish(1, "M", 2);

        //bird can access the eat method from Animal class because Bird is a child class of Animal
        bird1.eat();

        //fish can access the eat method from Animal class because Fish is a child class of Animal
        fish1.eat();
        fish1.swim();

    }
}

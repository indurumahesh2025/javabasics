package AbstractClassDemo;

public class Zoo {
    public static void main(String[] args) {

        Sparrow sparrow1 = new Sparrow(1, "F", 4);
        sparrow1.move();

        Fish fish1 = new Fish(1, "M", 2);
        fish1.move();

        //polymorphism - changing the object type
        Animal sparrow2 = new Sparrow(1, "F", 4);
        //I can call only the methods that are in the Animal class
        sparrow2.move();

        moveAnimals(fish1);
        moveAnimals(sparrow1);

    }
    public static void moveAnimals(Animal animal) {
        animal.move();
    }
}

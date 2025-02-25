package InterfaceDemo;

public class Zoo {
    public static void main(String[] args) {
        Chicken chick1 = new Chicken(1, "M", 7);
        //New overridden method from Chicken class is called
        chick1.fly();

        Sparrow sparrow1 = new Sparrow(1, "F", 4);
        //New interface method from Sparrow class is called
        sparrow1.fly();

    }
}

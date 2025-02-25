package java_basics;

public class LearningMethods {
    public static void main(String[] args) {;
        sayHello();
        sayHelloTo("John");
        sayHelloTo("Jane", 25);

        // Call the add10 method from MyUtils class
        int add10 = MyUtils.add10(10);

        // Call the add20 method from MyUtils class.
        // we need to create an object of MyUtils class because the method is not static
        MyUtils myVar = new MyUtils();
        int add20 = myVar.add20(10);

        System.out.println(add10);
        System.out.println(add20);

        // Call the sum2Numbers method from MyUtils class
        // We can call the method directly because it is static and does not require an object to be created
        MyUtils.sum2Numbers(10, 20);

    }

    // Method without a parameter
    public static void sayHello() {
        System.out.println("Hello");
    }

    // Method with a parameter
    public static void sayHelloTo(String name) {
        System.out.println("Hello " + name);
    }

    // Method with multiple parameters of different types (String and int)
    public static void sayHelloTo(String name, int age) {
        System.out.println("Hello " + name + " you are " + age + " years old.");
    }


}

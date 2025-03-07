package CloneObjDemo;

public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York");
        Person p1 = new Person("John", address);
        Person p2 = (Person) p1.clone();

        System.out.println(p1.name + " - " + p1.address.city); // John - New York
        System.out.println(p2.name + " - " + p2.address.city); // John - New York

        p2.address.city = "Los Angeles";
        System.out.println(p1.address.city); // Los Angeles (since it's a shallow copy, both refer to the same Address object)
    }
}

class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

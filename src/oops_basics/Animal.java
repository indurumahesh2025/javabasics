package oops_basics;

public class Animal {
   int age;
   String gender;
   int weightInLbs;

   //this is a constructor
    public Animal(int age, String gender1, int weightInLbs) {
        this.age = age;
        this.gender = gender1;
        this.weightInLbs = weightInLbs;
    }

    public void eat() {
        System.out.println("Eating... and age is "+this.age);
    }

    public void sleep() {
        System.out.println("Sleeping... and weight is "+this.weightInLbs);
    }

}

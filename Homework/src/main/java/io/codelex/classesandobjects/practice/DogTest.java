package io.codelex.classesandobjects.practice;

public class DogTest {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Max", "male", new Dog("Lady", "female"), new Dog("Rocky", "male"));
        Dog dog2 = new Dog("Rocky", "male", new Dog("Molly", "female"), new Dog("Sam", "male"));
        Dog dog3 = new Dog("Sparky", "male");
        Dog dog4 = new Dog("Buster", "male", new Dog("Lady", "female"), new Dog("Sparky", "male"));
        Dog dog5 = new Dog("Sam", "male");
        Dog dog6 = new Dog("Lady", "female");
        Dog dog7 = new Dog("Molly", "female");
        Dog dog8 = new Dog("Coco", "female", new Dog("Molly", "female"), new Dog("Buster", "male"));

        System.out.println(dog1.fathersName());
        System.out.println(dog3.fathersName());

        System.out.println(dog8.hasSameMotherAs(dog2));
        System.out.println(dog3.hasSameMotherAs(dog2));

    }
}

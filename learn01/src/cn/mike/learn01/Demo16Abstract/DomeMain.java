package cn.mike.learn01.Demo16Abstract;

public class DomeMain {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Dog dog = new Dog();
        Dog2Ha dog2Ha = new Dog2Ha();
        dog2Ha.eat();
        dog2Ha.sleep();
        System.out.println("=============");

        DogGolden dogGolden = new DogGolden();
        dogGolden.eat();
        dogGolden.sleep();
    }
}

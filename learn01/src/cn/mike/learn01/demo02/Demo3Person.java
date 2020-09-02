package cn.mike.learn01.demo02;

public class Demo3Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        person.name = "mua";
        person.setAge(101);
        person.show();
    }
}

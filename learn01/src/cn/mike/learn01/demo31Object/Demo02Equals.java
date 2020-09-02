package cn.mike.learn01.demo31Object;

public class Demo02Equals {
    public static void main(String[] args) {
        Person person1 = new Person("mua1", 22);
        Person person2 = new Person("mua1",22);
        System.out.println(person1);
        System.out.println(person2);
        boolean b = person1.equals(person2);
        System.out.println(b);
    }
}

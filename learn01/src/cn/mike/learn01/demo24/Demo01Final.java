package cn.mike.learn01.demo24;

import java.rmi.StubNotFoundException;

public class Demo01Final {
    public static void main(String[] args) {
        Student student = new Student("mua");
        System.out.println(student.getName());
        student = new Student("mua2");
        System.out.println("=======");
        final Student student1 = new Student("mua final");
//        student1 = new Student("mua2");
        student1.setName("mua2 final");
        System.out.println(student1.getName());
    }
}

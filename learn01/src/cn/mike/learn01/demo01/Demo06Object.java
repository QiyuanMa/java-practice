package cn.mike.learn01.demo01;

import jdk.swing.interop.SwingInterOpUtils;
import cn.mike.learn01.demo01.Student;

public class Demo06Object {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println("===================");
        student.name = "mua";
        student.age = 22;
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println("===================");
        student.eat();
        student.sleep();
        student.study();
    }


}

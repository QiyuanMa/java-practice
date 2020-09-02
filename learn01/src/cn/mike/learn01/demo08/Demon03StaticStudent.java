package cn.mike.learn01.demo08;

import org.w3c.dom.ls.LSOutput;

public class Demon03StaticStudent {
    public static void main(String[] args) {
        Student.room = "101教室";
        Student one = new Student(22,"mua");
        System.out.println("mua的年龄：" + one.getAge());
        System.out.println("mua的姓名：" + one.getName());
        System.out.println("mua的教室:" + Student.room);


        Student two = new Student(23,"root");

    }


}

package cn.mike.learn01.demo06;

import java.util.ArrayList;

public class Demo06ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("mua",22);
        Student two = new Student("mua2",22);
        Student three = new Student("mua3",22);
        Student four = new Student("mua4",22);
        Student five = new Student("mua5",22);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println("姓名："+student.getName()+" 年龄："+student.getAge());
        }
    }
}

package cn.mike.learn01.demo31Object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo01toString {
    public static void main(String[] args) {
        Person p = new Person("mua",20);
        System.out.println(p.toString());
        System.out.println(p);

        System.out.println("=========");
        Random random = new Random();
        System.out.println(random);

        System.out.println("===========");
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);

        System.out.println("==========");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);

    }
}

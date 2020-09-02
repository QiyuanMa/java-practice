package cn.mike.learn01.demo05;

import java.util.Random;
import java.util.Scanner;

public class Demo03Random {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int anInt = new Scanner(System.in).nextInt();
        Random random = new Random();
        int x = random.nextInt(anInt)+1;
//        System.out.println();
        System.out.println(x);
    }
}

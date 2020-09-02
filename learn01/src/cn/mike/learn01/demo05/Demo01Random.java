package cn.mike.learn01.demo05;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt();
        System.out.println("随机数是:" + i);
    }
}

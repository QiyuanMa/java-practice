package cn.mike.learn01.demo05;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(10);
            System.out.println("随机数是："+num);
        }
    }
}

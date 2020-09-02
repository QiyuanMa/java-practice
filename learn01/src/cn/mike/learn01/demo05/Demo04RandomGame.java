package cn.mike.learn01.demo05;

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("请输入你猜测的数字：");
        Scanner scanner = new Scanner(System.in);
        int anInt = random.nextInt(100);
        int guessNum = scanner.nextInt();
        while (true) {
            if (guessNum < anInt) {
                System.out.println("太小了，请重试");
            } else if (guessNum > anInt) {
                System.out.println("太大了，请重试");
            } else {
                System.out.println("恭喜！猜对了");
                break;
            }
        }
    }
}

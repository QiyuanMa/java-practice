package cn.mike.learn01.demo05;


import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数字");
        int b = scanner.nextInt();
        System.out.println("结果是"+ a+b);
    }
}

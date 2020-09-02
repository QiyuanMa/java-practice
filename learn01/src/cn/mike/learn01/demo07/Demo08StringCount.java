package cn.mike.learn01.demo07;

import java.util.Scanner;

/*
* 输入，用Scanner
* 输入String，String string = scanner.next()
* 定义四个变量，代表四种字符次数
* 对一个一个字检查，从string->char，toCharArray()
* 遍历char[]字符数组，对当前字符种类进行判断，并用四个变量进行++
* */
public class Demo08StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = scanner.next();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if('A' <= ch && ch <= 'Z'){
                countUpper++;
            } else if('a' <= ch && ch <= 'z'){
                countLower++;
            } else if('0' <= ch && ch <= '9'){
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println("大写字母有："+ countUpper + "小写子母有：" + countLower + "数字有：" + countNumber + "其他字符有：" + countOther);
    }
}

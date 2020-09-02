package cn.mike.learn01.demo09;

import java.util.Arrays;

/*
* */
public class Demo02ArraysPracise {
    public static void main(String[] args) {
        String string = "sajfaflnlnlkfnafn";
        char[] chars = string.toCharArray();
        Arrays.toString(chars);

        //需要倒序遍历
        for (int length = chars.length; length > 0; length--) {
            System.out.println(chars[length]);
        }
    }
}

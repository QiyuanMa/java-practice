package cn.mike.learn01.demo09;

import org.w3c.dom.ls.LSOutput;

/*
* public static double abs(double num)
* public static double ceil(double num)
* public static double floor(double num)
* public static long round(double num)*/
public class Demo03Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(-3.14));
        System.out.println("=================");

        //向上取整
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.floor(3.1));
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.5));
    }
}

package cn.mike.learn01.demo32Date;

import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); //获取当前系统到1970年1月1日00:00:00经历了多少毫秒
        demo01();
        demo02();
        demo03();
    }

    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    private static void demo02() {
        Date date = new Date(1599016368799L);
        System.out.println(date);
    }

    private static void demo01() {
        Date date = new Date();
        System.out.println(date);

    }
}

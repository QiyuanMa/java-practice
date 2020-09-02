package cn.mike.learn01.Demo33Calendar;

import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }

    private static void demo04() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);
    }

    private static void demo03() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 2);
        calendar.add(Calendar.MONTH, -3);
        System.out.println(Calendar.YEAR +"年" + Calendar.MONTH +"月");

    }

    private static void demo02() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 9999);
        calendar.set(Calendar.MONTH, 9);
        calendar.set(Calendar.DATE, 9);
        //同时设置年月日，可以用set的重载方法
        calendar.set(8888,8,8);


    }

    /*
    * public int get(int field): 返回给定Calendar字段的指
    * 参数：传递指定的日历字段(YEAR, MONTH, ...)
    * 返回值：日历字段代表的具体的指
    * */
    private static void demo01() {
        //使用getCalendar()方法获取Calendar对象
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);

        int date = calendar.get(Calendar.DATE);
        System.out.println(date);



    }
}

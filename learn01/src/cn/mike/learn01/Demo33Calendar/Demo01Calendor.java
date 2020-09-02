package cn.mike.learn01.Demo33Calendar;

import java.util.Calendar;

public class Demo01Calendor {
    /*
    * java.util.Calendar类.日历类
    * Calendar是一个抽象类，提供了很多操作日历字段的方法(YEAR, MONTH, DAY_OF_MONTH, HOUR)
    * Calendar类无法直接创建对象使用，getInstance返回了Calender类的子类对象
    * static Calendar getInstance() */
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
    }
}

package cn.mike.learn01.demo32Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
* 练习：
* 使用日期时间相关API，计算一个人出生了多少天
* 分析：
* 1. 使用Scanner获取出生日期
* 2. 使用DateFormat中parse方法把字符串出生日期，解析为Date格式的出生日期
* 3. 把Date格式的出生日期转换为毫秒值
* 4. 获取当前日期，转换为毫秒值
* 5. 毫秒转化为天*/
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式yyyy-MM-dd");
        String birthdayDateString = scanner.next();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //字符串按照格式解析为标准化时间
        Date birthdayDate = simpleDateFormat.parse(birthdayDateString);
        System.out.println(birthdayDate);
        //转化为毫秒
        long birthdayDateTime = birthdayDate.getTime();
        System.out.println(birthdayDateTime);
        //获取当前时间，转化为毫秒
        long todayTime = new Date().getTime();
        long time = todayTime - birthdayDateTime;
        System.out.println(time/1000/60/60/24);


    }

}

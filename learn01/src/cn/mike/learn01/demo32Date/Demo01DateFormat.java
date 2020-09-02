package cn.mike.learn01.demo32Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 日期：
* y 年
* M 月
* d 日
* H 时
* m 分
* s 秒
* yyyy-MM-dd HH:mm:ss
* */
public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }

    private static void demo02() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = simpleDateFormat.parse("2020年05月26日 20时56分54秒");
        System.out.println(date);

    }

    private static void demo01() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date date = new Date();
        String d = simpleDateFormat.format(date);
        System.out.println(date);
        System.out.println(d);
    }
}

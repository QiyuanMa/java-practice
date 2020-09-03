package cn.mike.learn01.demo36Integer;
/*
* 基本类型与字符串类型的相互转换
*   基本类型 -> 字符串
*   1. 基本类型值+""最简单的方法（常用）
*   2. 包装类的静态方法toString(参数)，不是Object类的toString()重载
*       static String toString(int i) 返回一个表示指定整数的String对象
*   3. String类的静态方法valueOf(参数)
*       static String valueOf(int i)
*   字符串 -> 基本类型 parseXXX("字符串")
*   Integer:  static int parseInt(String s)*/
public class Demo03Integer {
    public static void main(String[] args) {
        //基本类型 -> 字符串
        int i1 = 100;
        String s1 = i1 + "";
        System.out.println(s1 + 200);

        String s2 = Integer.toString(100);
        System.out.println(s2 + 200);

        String s3 = String.valueOf(100);
        System.out.println(s3 + 200);

        //字符串 -> 基本类型 parseXXX("字符串")
        int i = Integer.parseInt(s1);
        System.out.println(i);


    }
}

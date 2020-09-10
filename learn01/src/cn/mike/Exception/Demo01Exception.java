package cn.mike.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
*   java.lang.Throwable: 类是Java语言中所有错误或异常的超类
*       Exception：编译期异常，进行编译（写代码）java程序出现的问题
*           RuntimeException：运行期异常，java程序运行过程中出现的问题
*           异常就相当于程序得了一个小毛病，处理掉异常，程序可以继续执行
*       Error：错误
*           错误相当于程序得了一个无法治愈的毛病，必须修改源代码，程序才能继续执行*/
public class Demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
   /*     //Exception：编译期异常，进行编译（写代码）java程序出现的问题
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //使用try-catch好处是异常处理后程序可以正常继续运行
        Date date = null;
        try {
            date = sdf.parse("1999-0999");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);*/
/*        int[] arr = {1,2,3};
        try{
            //可能会出现异常的代码
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println(e);
        }*/
        /*Error错误
        * OutOfMemoryError: Java heap space
        * 内存溢出的错误，创建的数组太大了，超出了给JVM分配的内存
        * */
//        int[] arr = new int[1024*1024*1024];
        int[] arr = new int[1024*1024];
        //必须修改代码，创建的数组小一点
        System.out.println("后续代码");
    }
}

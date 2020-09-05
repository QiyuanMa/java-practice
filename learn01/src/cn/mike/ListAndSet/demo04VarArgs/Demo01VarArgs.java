package cn.mike.ListAndSet.demo04VarArgs;
/*
* 可变参数：
*   1. 一个方法的参数列表，只能有一个可变参数
*   2， 如果方法参数有多个，可变参数必须写在参数列表的末尾*/
public class Demo01VarArgs {
    public static void main(String[] args) {
        //定义一个方法，计算两个整数的和
        int i = add(10,20,30,40,50);
        method("abc",5.5,3,1,2,3,4,5);
        System.out.println(i);
    }
    //可变参数终极写法：参数类型，个数都可变
    public static void method2(Object...objects){}
    public static void method(String b, double c, int d, int...a){

    }
    //可变参数
    //add()创建一个长度为0的数组 new int[0]
    //add(10,20,30,40,50) 创建一个长度为5的数组 new int[]{10,20,30,40,50};
    public static int add(int...arr){
//        System.out.println(arr); // 数组地址
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
/*    public static int add(int a, int b) {
        return a+b;
    }*/
}

package cn.mike.learn01.demo08;

public class MyClass {
    int num;
    static int numStatic;
    public void method(){
        System.out.println("这是一个普通成员方法");
        System.out.println(num);
        System.out.println(numStatic);
        System.out.println(this);
    }
    public static void methodStatic(){
        System.out.println("这是一个静态成员方法");
        System.out.println(numStatic);
    }

}

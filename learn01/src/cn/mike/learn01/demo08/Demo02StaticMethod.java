package cn.mike.learn01.demo08;

public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        MyClass.methodStatic();
        myMethod();
        Demo02StaticMethod.myMethod();
    }
    public static void myMethod(){
        System.out.println("自己的方法！");
    }
}

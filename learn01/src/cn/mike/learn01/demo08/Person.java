package cn.mike.learn01.demo08;
/*静态代码块：
* 当第一次用到本类时，静态代码块中内容执行唯一的一次
* 用来一次性对静态成员进行赋值
* jdbc中常用*/
public class Person {
    static {
        System.out.println("静态代码块执行");
    }
    public Person(){
        System.out.println("构造方法执行！");
    }
}

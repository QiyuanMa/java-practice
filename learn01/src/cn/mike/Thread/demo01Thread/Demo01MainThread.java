package cn.mike.Thread.demo01Thread;

/*
* 主线程： 执行主方法(main)的线程
*
* 单线程程序：java程序中只有一个线程
* 执行从main方法开始，从上到下依次执行*/
public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("mua1");
        p1.run();
        Person p2 = new Person("mua2");
        p2.run();
    }
}

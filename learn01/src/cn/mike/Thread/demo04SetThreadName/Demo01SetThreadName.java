package cn.mike.Thread.demo04SetThreadName;

public class Demo01SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThread mt = new MyThread();
        mt.setName("小强");
        mt.start();
        new MyThread("旺财").start();

    }
}

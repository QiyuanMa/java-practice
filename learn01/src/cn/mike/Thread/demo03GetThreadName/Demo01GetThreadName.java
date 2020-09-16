package cn.mike.Thread.demo03GetThreadName;

import cn.mike.learn01.demo27.MyInterface;

/*
* 线程的名称：
*   主线程：main
*   新线程：Thread-0, Thread-1, Thread-2*/
public class Demo01GetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        new MyThread().start();
        new MyThread().start();
        System.out.println("========");
        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}

package cn.mike.Thread.demo03GetThreadName;
/*
* 获取线程的名称：
*   1. 使用Thread类的方法getName()
*       String getName() 返回线程的名称
*   2. currentThread返回正在执行的线程对象的引用*/
public class MyThread extends Thread{
    //重写Thread类中的run方法，设置线程任务
    @Override
    public void run() {
        String name = getName();
        System.out.println(name);
        Thread t = Thread.currentThread();
        System.out.println(t);
    }
}

package cn.mike.Thread.ThreadAndLambda;
/*
* 创建Runnable接口的实现类，重现run方法，设置线程任务*/
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新的线程创建了");
    }
}
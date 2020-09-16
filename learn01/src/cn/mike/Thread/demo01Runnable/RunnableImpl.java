package cn.mike.Thread.demo01Runnable;
//1. 创建一个Runnable接口的实现类（该类对象预期使用线程执行）
public class RunnableImpl implements Runnable{
    //2. 在实现类中重写Runnable接口的Run方法，设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
package cn.mike.Thread.demo10Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
*   买票案例出现了线程安全问题
*   卖出了不存在的票和重复的票
*
*   解决线程安全问题的二种方案：使用Lock锁
*
*   Lock实现了提供比使用synchronized方法和语句可获得的更广泛的锁定操作。
*   Lock接口中的方法：
*       void Lock()获取锁
*       void unLock()释放锁
*   java.util.concurrent.locks.ReentrantLock implements Lock接口
*   使用步骤：
*       1. 在成员位置创建一个ReentrantLock对象
*       2. 在可能会出现安全问题的代码前调用Lock接口中的方法Lock获取锁
*       3. 在可能会出现安全问题的代码后调用Lock接口中的方法unLock获取锁
*
 */
public class RunnableImpl implements Runnable {
    //定义一个多个线程共享的票源
    private int ticket = 100;

    //1. 在成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();

    //设置线程任务：免票
    @Override
    public void run() {
        //死循环让卖票操作重复执行
        while (true)
        {
            //2. 在可能会出现安全问题的代码前调用Lock接口中的方法Lock获取锁
            l.lock();
            if(ticket>0) {
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(10);
                    //票存在，买票 ticket--
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //3. 在可能会出现安全问题的代码后调用Lock接口中的方法unLock获取锁
                    l.unlock();
                }
                //发现出现了重复和不存在的票


            }


        }
    }
}

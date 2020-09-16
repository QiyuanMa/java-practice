package cn.mike.Thread.demo07ThreadSafe;

public class RunnableImpl implements Runnable {
    //定义一个多个线程共享的票源
    private int ticket = 100;
    //设置线程任务：免票
    @Override
    public void run() {
        //死循环让卖票操作重复执行
        while (ticket > 0)
        {
            //提高安全问题出现的概率，让程序睡眠
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //发现出现了重复和不存在的票

            //票存在，买票 ticket--
            System.out.println(Thread.currentThread().getName() + "-->正在卖第"+ticket+"张票");
            ticket--;
        }
    }
}

package cn.mike.Thread.demo12Practice;
/*
* 消费者（吃货）类：是一个线程类，可以继承Thread
* 设置线程任务（run）：吃包子
* 对包子的状态进行判断
* false: 没有包子
*   吃货调用wait方法进入等待状态
* true: 有包子
*   吃货吃包子
*   吃货吃完包子
*   修改包子的状态为false 没有
*   吃货唤醒包子铺线程，生产包子*/
public class ChiHuo extends Thread {
    //需要再成员位置创建一个包子变量
    private BaoZi baoZi;
    //使用带参构造方法，为这个包子变量赋值
    public ChiHuo(BaoZi baoZi) {
        this.baoZi = baoZi;
    }
    //设置线程任务（run）：吃包子
    @Override
    public void run() {
        //使用死循环，让吃货一直吃包子
        while(true) {
            //必须同步技术保证两个线程只能有一个在执行
            synchronized (baoZi) {
                if (!baoZi.flag) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后执行的代码，吃包子
                System.out.println("吃货正在吃：" + baoZi.pi + baoZi.xian + "的包子");

                //吃货吃完包子
                //修改包子的状态为false
                baoZi.flag = false;
                //吃货唤醒包子铺进程，生产包子
                baoZi.notify();
                System.out.println("吃货已经把：" + baoZi.pi + baoZi.xian + "的包子吃完了，包子铺生产包子");
                System.out.println("===============");
            }
        }
    }
}

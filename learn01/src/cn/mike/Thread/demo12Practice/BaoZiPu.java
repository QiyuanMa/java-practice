package cn.mike.Thread.demo12Practice;
/*
*   包子铺类：线程类，继承Thread
*   设置线程任务(run)：生产包子
*   对包子状态进行判断
*   true: 有包子
*       包子铺：调用wait方法进入等待
*   false: 无包子
*       包子铺生产包子
*       交替生产两种包子
*           两种状态(i%2==0)
*       包子铺生产好了包子
*       修改包子的状态为true 有
*       唤醒吃货进程，让吃货线程吃包子
*   注意：
*       包子铺线程和包子线程 --> 通信（互斥）
*       必须使用同时同步技术保证两个线程只能有一个在执行
*       锁对象必须保证唯一，使用包子对象作为锁对象
*       包子铺类和吃货类需要把包子对象作为参数传递过来
*           1. 需要在成员位置创建一个包子变量
*           2. 使用带参数构造方法，为这个包子变量赋值*/
public class BaoZiPu extends Thread{

    //需要再成员位置创建一个包子变量
    private BaoZi bz;

    //使用带参数构造方法，为这个包子变量赋值
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    //设置线程任务(run):生产包子

    @Override
    public void run() {
        //定义一个变量
        int count = 0;
        // 让包子铺一直生产包子
        while (true) {
            // 必须使用同时同步技
            // 术保证两个线程只能有一个在执行
            synchronized (bz){
                if(bz.flag) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后执行，包子铺生产包子
                //增加一些趣味性：交替生产两种包子
                if(count%2==0) {
                    //生产 薄皮三鲜馅包子
                    bz.pi = "薄皮";
                    bz.xian = "三鲜馅";
                } else {
                    bz.pi = "冰皮";
                    bz.xian = "牛肉大葱馅";
                }
                count++;
                System.out.println("包子铺正在生产：" + bz.pi + bz.xian + "包子");
                //生产包子需要3秒钟
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //包子铺生产好了包子
                //修改包子的状态为true
                bz.flag = true;
                bz.notify();
                System.out.println("包子已经生产好了：" + bz.pi + bz.xian + "包子，吃货可以开始吃了");
            }
        }

    }
}

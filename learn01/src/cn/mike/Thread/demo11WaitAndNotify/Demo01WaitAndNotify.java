package cn.mike.Thread.demo11WaitAndNotify;
/*
* 等待处理案例：线程间通信
*
* 注意：
*   顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
*   同步使用的锁对象必须保证唯一
*   只有锁对象才能调用wait和notify方法*/
public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj = new Object();
        //创建一个顾客线程
        new Thread(){
            @Override
            public void run() {
                while(true){
                    //保证等待和唤醒的线程只能有一个执行，使用同步技术
                    synchronized (obj){
                        System.out.println("告知老板要的包子的种类数量");
                        //调用wait方法，放弃cpu的执行，进入到WAITING状态（无限等待）
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子已经做好了，开吃");
                        System.out.println("===============");
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while(true){
                    //花了5秒做包子
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("老板5s后做好包子告知顾客");
                        obj.notify();
                    }
                }
            }
        }.start();

    }
}

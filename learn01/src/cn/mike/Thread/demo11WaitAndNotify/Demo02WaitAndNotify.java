package cn.mike.Thread.demo11WaitAndNotify;
/*
*   进入到TimeWaiting（计时等待）两种方式：
*       1. 使用sleep(long m)方法，在毫秒值结束之后，线程睡醒进入到Runnable/Blocked状态
*       2. 使用wait(long m)方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来，线程进入到Runnable/Blocked状态
*   */
public class Demo02WaitAndNotify {
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
                        System.out.println("顾客1告知老板要的包子的种类数量");
                        //调用wait方法，放弃cpu的执行，进入到WAITING状态（无限等待）
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("顾客1包子已经做好了，开吃");
                        System.out.println("===============");
                    }
                }
            }
        }.start();

        //创建一个顾客2线程
        new Thread(){
            @Override
            public void run() {
                while(true){
                    //保证等待和唤醒的线程只能有一个执行，使用同步技术
                    synchronized (obj){
                        System.out.println("顾客2告知老板要的包子的种类数量");
                        //调用wait方法，放弃cpu的执行，进入到WAITING状态（无限等待）
                        try {
                            obj.wait(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("顾客2包子已经做好了，开吃");
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
//                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }
}

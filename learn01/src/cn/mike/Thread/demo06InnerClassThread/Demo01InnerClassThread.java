package cn.mike.Thread.demo06InnerClassThread;

public class Demo01InnerClassThread {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + "黑马");
                }
            }
        }.start();

        //线程的接口Runnable
        //RunnableImpl r = new Runnable();
        Runnable r = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + "程序员");
                }
            }
        };
        new Thread(r).start();

        //简化接口的方法
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + "传智播客");
                }
            }
        }).start();
    }
}

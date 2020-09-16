package cn.mike.Thread.demo01Runnable;
/*
* 创建多线程的第二种方式：实现Runnable接口
*   Runnable接口应由哪些打算通过某一线程执行其实例的类来实现，类必须定义一个称为run的无参数方法
*
* 实现Runnable接口创建多线程程序的好处：
*   1. 避免了单继承的局限性
*       一个类只能继承一个父类，类继承了Thread类就不能继承其他类
*       实现了Runnable接口，还可以继承其他类，实现其他接口
*   2. 增强了程序的拓展性，
*
*/
public class Demo01Runnable {
    public static void main(String[] args) {
        //3. 创建一个Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //4. 创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t = new Thread(run);
        //5. 调用Thread类的start方法，开启新线程实现start方法
        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}

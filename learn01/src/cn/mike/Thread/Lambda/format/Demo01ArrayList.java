package cn.mike.Thread.Lambda.format;
/*
*   Lambda表达式：是可推导，可以省略
*   凡是根据上下文推导出来的内容，都可以省略
*   可以省略的内容：
*       1. （参数列表）：括号中参数列表的数据类型可以省略
*       2. （参数列表）：括号中的参数如果只有一个，数据类型和()都可以省略
*       3. {一些代码}：如果{}中的代码只有一行，无论是否有返回值，都可以省略({}, return, 分号)
*           注意：要省略{}, return, 分号必须一起省略
*   */
public class Demo01ArrayList {
    public static void main(String[] args) {
        //使用匿名内部类实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        }).start();

        //使用Lambda表达式实现多线程
        new Thread(() -> System.out.println(Thread.currentThread().getName()+"新线程创建了")).start();

        //优化省略Lambda

    }
}

package cn.mike.Thread.Lambda.p1;
/*
*   要求：
*       给定一个厨子Cook接口，内含唯一的抽象方法makeFood，且无参数，无返回值
*       使用Lambda的标准格式调用invokeCook方法，打印输出 吃饭啦 字体*/
public class Demo01Cook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        //使用Lambda表达式简化匿名内部类的方法
        invokeCook(()->{
            System.out.println("吃饭了！");
        });

        //使用优化Lambda表达式
        invokeCook(()->System.out.println("吃饭了！"));

    }

    //定义一个方法，参数传递Cook接口，方法内部调用Cook接口中的方法makeFood
    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}

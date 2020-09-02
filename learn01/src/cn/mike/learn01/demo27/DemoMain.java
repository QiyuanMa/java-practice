package cn.mike.learn01.demo27;
/*
* 如果是接口的实现类，只需要使用唯一的一次，
* 可省略该类的定义，改为使用 匿名内部类
* 但只能使用唯一一次，创建唯一一次
* 匿名内部类省略类实现，匿名对象省略对象名*/
public class DemoMain {
    public static void main(String[] args) {
//        MyInterface obj = new MyInterfaceImpl();
//        obj.method();

        // 匿名内部类
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        myInterface.method();
        //既是匿名内部类，也是匿名对象
        new MyInterface(){
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法222");
            }
        }.method();
    }
}

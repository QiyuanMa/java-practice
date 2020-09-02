package cn.mike.learn01.Demo18;
/*
接口是多个类的公共规范。
接口是一种引用数据类型，最重要的内容就是其中的：抽象方法。
如何定义一个接口的格式：
public interface yty、【
 */
public class Demo01Interface {
    public static void main(String[] args) {
//        错误写法，不能直接new interface
//        MyInterfaceAbstract interfaceAbstract = new MyInterfaceAbstract();
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs();
        impl.methodAbs2();
    }
}

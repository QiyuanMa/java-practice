package cn.mike.learn01.Demo19;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodsAbs() {
        System.out.println("实现了抽象方法，BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写的抽象方法");
    }
}

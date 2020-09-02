package cn.mike.learn01.Demo19;

public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodsAbs();
        a.methodDefault();
        System.out.println("=========");
        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodsAbs();
        b.methodDefault();
    }
}


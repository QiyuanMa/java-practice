package cn.mike.learn01.Demo19;

public interface MyInterfaceDefault {
    public abstract void methodsAbs();
//    public abstract void methodAbs2();
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");

    }
}

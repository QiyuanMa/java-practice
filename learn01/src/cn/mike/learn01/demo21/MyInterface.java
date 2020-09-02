package cn.mike.learn01.demo21;

/*

 */
public interface MyInterface extends MyInterfaceA, MyInterfaceB{
    public abstract void method();

    @Override
    default void methodDefault() {

    }
}

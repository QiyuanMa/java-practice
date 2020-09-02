package cn.mike.learn01.demo20;

public abstract class MyInterfaceAbstract implements MyInterfaceA, MyInterfaceB{
    /*
    如果实现类所实现的多个接口中，存在重复的抽象方法，只需要覆盖重写一次即可
    如果实现类没有覆盖重写所有接口当中的所有抽象方法，那么实现类必须是一个抽象类

     */
    @Override
    public void methodA() {

    }


    @Override
    public void methodAbs() {

    }

    @Override
    public void methodDefault() {

    }
}

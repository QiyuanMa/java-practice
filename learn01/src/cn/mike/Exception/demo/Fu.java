package cn.mike.Exception.demo;
/*
* 父类异常啥样，子类异常就啥样*/
public class Fu {
    public void show01() throws NullPointerException, ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04() {}
}

class Zi extends Fu{
    public void show01() throws NullPointerException, ClassCastException{}
    public void show02() throws ArrayIndexOutOfBoundsException{}
    public void show03() {}
    /*
    * 父类方法没有抛出异常，子类重写父类方法时也不能抛出异常
    * 只能捕获处理，不能声明抛出*/
    public void show04() {
        try {
            throw new IllegalAccessException();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}


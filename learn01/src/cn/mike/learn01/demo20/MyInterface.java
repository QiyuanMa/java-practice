package cn.mike.learn01.demo20;

public interface MyInterface {
    public default void method(){
        System.out.println("接口的默认方法");
    }
}

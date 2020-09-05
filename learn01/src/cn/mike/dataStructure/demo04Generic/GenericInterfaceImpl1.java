package cn.mike.dataStructure.demo04Generic;
/*  在创建类时就确定泛型
* public interface Iterator<E> {
*   E next();
* }*/
public class GenericInterfaceImpl1 implements GenericInterface<String> {

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}

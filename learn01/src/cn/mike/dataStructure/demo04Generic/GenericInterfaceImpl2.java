package cn.mike.dataStructure.demo04Generic;
/*
* 定义一个含有泛型的类，创建对象的时候再确定泛型的类型
* 接口使用什么泛型，实现类使用什么泛型，类跟着接口走
* public interface List<E> {
*   boolean add(E e);
*   E get(int index)
*
* public class ArrayList<E> implements List<E>{
*   public boolean add(E e) {}
*   public E get(int index) {}*/
public class GenericInterfaceImpl2<E> implements GenericInterface<E> {


    @Override
    public void method(E e) {
        System.out.println(e);
    }
}

package cn.mike.dataStructure.demo01Collection;

import java.util.Collection;
import java.util.HashSet;
/*
* 来自Collection的顶层方法，底层无论是啥集合都可以用*/
public class Demo01Collection {
    public static void main(String[] args) {
//        Collection<String> coll = new ArrayList<>();
        Collection<String> coll = new HashSet<>();
        System.out.println(coll);
        /*
        * public boolean add(E e) 把给定对象添加到当前集合中
        * 返回值是boolean，一般返回true*/
        coll.add("mua1");
        coll.add("mua2");
        coll.add("mua3");
        System.out.println(coll);

        /*public boolean remove(E e) 把给定的对象在当前集合中删除*/
        coll.remove("mua2");

        /*public boolean contain(E e) 判断集合中是否包含给定的对象*/
        boolean b = coll.contains("mua3");
        System.out.println("b:" +b);

        /*public boolean isEmpty() 判断当前集合是否包含给定对象
        * 包含返回true
        * 不包含返回false*/
        boolean b1 = coll.isEmpty();
        System.out.println("b1:" + b1);

        /*public int size() 返回集合中元素的个数*/
        int size = coll.size();
        System.out.println("size: " + size);

        //public Object[] toArray(): 集合中元素，存储到数组中
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /*public void clear() 清空集合中所有元素，但不删除集合，集合才存在*/
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());
    }
}

package cn.mike.dataStructure.demo05Collections;

import java.util.ArrayList;
import java.util.Collections;
/*
* sort(List<T> list) 使用前提：
* 被排序的集合里边存储的元素，必须实现Comparable,重写接口中的方法
*
* Comparable接口的排序规则：
*   自己(this) - 参数： 升序
*   参数 - 自己(this)：降序*/
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);
        Collections.sort(list01);
        System.out.println(list01);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("b");

        Collections.sort(list02);
        System.out.println(list02);

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("mua1",22));
        list03.add(new Person("mua2",23));
        list03.add(new Person("mua3",20));
        System.out.println(list03);
        Collections.sort(list03);
        System.out.println(list03);
    }
}

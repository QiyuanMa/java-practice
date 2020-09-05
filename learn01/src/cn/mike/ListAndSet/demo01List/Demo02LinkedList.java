package cn.mike.ListAndSet.demo01List;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * LinkedList集合的特点
 * 1. 底层数据结构，查询慢，增删快
 * 2， 包含大量操作首尾元素的方法
 * 3. 不能使用多态*/
public class Demo02LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        linked.addFirst("www");
        System.out.println(linked);
        linked.push("www2");
        System.out.println(linked);
        linked.addLast("com");
        System.out.println(linked);
        if (!linked.isEmpty()){
            String first = linked.getFirst();
            System.out.println(first);
            String last = linked.getLast();
            System.out.println(last);
        }
        String removeFirst = linked.removeFirst();
        System.out.println("移除的第一个元素：" + removeFirst);
        linked.remove("a");
        System.out.println(linked);
        for (String s : linked) {
            System.out.println(s);
        }
//        linked.clear();

    }

}

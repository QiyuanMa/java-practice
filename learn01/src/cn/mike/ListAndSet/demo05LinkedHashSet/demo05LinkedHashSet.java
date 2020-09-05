package cn.mike.ListAndSet.demo05LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/*
*  LinkedHashSet集合 extends HashSet集合
*  LinkedHashSet集合特点：
*   底层是一个哈希表(数组+链表/红黑树) + 链表：多了一条链表(记录元素的存储顺序)，保证元素有序  同时查询又高效
*   HashSet每次add总要判断hashcode导致效率低*/
public class demo05LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);


        //有序的HashSet
        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("itcast");
        System.out.println(linked);

    }
}

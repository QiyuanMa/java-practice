package cn.mike.ListAndSet.demo01List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);

        list.add(3, "itheima");
        System.out.println(list);

        //移除元素remove
        String removeE = list.remove(2);
        System.out.println("被移除的元素：" + removeE);
        System.out.println(list);

        //set(int index, E element)方法，替换，返回更新前的元素
        String setE = list.set(4, "E");
        System.out.println("被替换的元素：" + setE);
        System.out.println(list);

        System.out.println("=======");
        //list集合遍历有3种方式
        for (String string : list) {
            System.out.println(string);
        }
        System.out.println("=======");
        //迭代器Iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
    }
}

package cn.mike.dataStructure.demo04Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        show();
    }

    private static void show() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        //使用迭代器遍历list集合
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s + "->" + s.length());

        }
    }
}

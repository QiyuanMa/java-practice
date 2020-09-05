package cn.mike.dataStructure.demo04Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
* 泛型的通配符：
*   ?: 代表任意数据类型
* 使用方式：
*   不能创建对象使用
*   只能通过方法的参数使用
* */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<Object> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");
        printArray(list01);
        printArray(list02);

    
    }
    /*定义一个方法，能遍历所有类型的ArrayList集合
     * 可使用泛型的通配符?接收数据类型*/
    public static void printArray(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while(it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }
    }
}

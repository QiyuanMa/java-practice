package cn.mike.dataStructure.demo03Foreach;

import java.util.ArrayList;

/*
* 增强for循环
* Collection<E> extends Iterable<E> 所有的单列集合都可以使用增强for
* for(集合/数组的数据类型 变量名：集合名/数组名) {}*/
public class Demo02Foreach {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        for (String string : arrayList) {
            System.out.println(string);
        }
    }

    private static void demo01() {
        int[] arr = {1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

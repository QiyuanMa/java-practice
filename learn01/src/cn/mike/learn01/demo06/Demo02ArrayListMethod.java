package cn.mike.learn01.demo06;

import java.util.ArrayList;

public class Demo02ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        boolean success = list.add("mua");
        System.out.println(list);
        System.out.println("是否成功"+ success);
        list.add("mua1");
        list.add("mua2");
        list.add("mua3");
        String name = list.get(2);
        System.out.println("索引2的位置："+name);
        String whoRemoved = list.remove(3);
        System.out.println("被删除的是："+whoRemoved);
        System.out.println(list);
        int size = list.size();
        System.out.println("集合的长度是"+size);
    }
}

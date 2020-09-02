package cn.mike.learn01.demo06;

import java.util.ArrayList;

public class Demo04ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println(list);
        int num = list.get(2);
        System.out.println("第二个元素是："+ num);
    }
}

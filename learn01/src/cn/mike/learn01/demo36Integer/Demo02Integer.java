package cn.mike.learn01.demo36Integer;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo02Integer {
    public static void main(String[] args) {
        //自动装箱
        Integer integer = 1;
        //自动拆箱，等价于integer.intValue() + 2
        integer=integer+2;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // 自动装箱 list.add(new Integer(1));
        Integer integer1 = list.get(0); // 自动拆箱 list.get(0).intValue();
    }
}

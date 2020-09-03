package cn.mike.learn01.demo36Integer;

import cn.mike.learn01.demo25.Outer;

public class Demo01Integer {
    public static void main(String[] args) {
        Integer integer1 = new Integer(1);
        System.out.println(integer1);

        Integer integer2 = new Integer("1");
        System.out.println(integer2);

        Integer integer3 = Integer.valueOf(3);
        System.out.println(integer3);

        Integer integer4 = Integer.valueOf("2");
        System.out.println(integer4);

        int i1 = integer1.intValue();
        System.out.println(i1);

    }
}

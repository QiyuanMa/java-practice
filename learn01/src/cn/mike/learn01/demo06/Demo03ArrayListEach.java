package cn.mike.learn01.demo06;

import java.util.ArrayList;

public class Demo03ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("mua");
        list.add("mua1");
        list.add("mua2");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}

package cn.mike.learn01.demo06;

import java.util.ArrayList;

public class Demo07ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("mua");
        list.add("mua1");
        list.add("mua2");
        list.add("mua3");
        System.out.println(list);
        printArrayList(list);
    }
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i == list.size()-1){
                System.out.println(name+"}");

            }else {
                System.out.print(name+"@");
            }


        }

    }
}

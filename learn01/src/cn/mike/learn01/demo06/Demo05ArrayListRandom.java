package cn.mike.learn01.demo06;

import java.util.ArrayList;
import java.util.Random;

public class Demo05ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int n = random.nextInt(33)+1;
            list.add(n);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

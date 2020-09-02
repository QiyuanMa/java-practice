package cn.mike.learn01.demo06;

import java.util.ArrayList;
import java.util.Random;

public class Demo08ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();;
        Random random = new Random();
        for(int i=0; i<20; i++){
            int num = random.nextInt(100)+1;
            biglist.add(num);
        }
        System.out.println(getSmallList(biglist));
        System.out.println("偶数个数："+getSmallList(biglist).size());

    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> biglist){
        ArrayList<Integer> smalllist = new ArrayList<>();
        for (int i = 0; i < biglist.size(); i++) {
            int num = biglist.get(i);
            if(num % 2 == 0){
                smalllist.add(num);
            }
        }
        return smalllist;
    }
}

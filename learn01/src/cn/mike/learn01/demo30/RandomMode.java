package cn.mike.learn01.demo30;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode {
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 最少1分钱，最多不超过“剩下金额平均数的2倍”

        Random random = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        for (int i = 0; i < totalCount - 1 ; i++) {
            int money = random.nextInt(leftMoney/leftCount*2-1) +1;
            arrayList.add(money);
            leftMoney -= money;
            leftCount--;
        }
        arrayList.add(leftMoney);
        return arrayList;
    }
}

package cn.mike.learn01.demo30;

import java.util.ArrayList;

public class NormalMode {
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;

        for (int i = 0; i < totalCount - 1; i++) {
            arrayList.add(avg);
        }
        //零头放最后一个红包中
        arrayList.add(avg + mod);

        return arrayList;
    }
}

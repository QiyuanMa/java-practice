package cn.mike.learn01.Demo17Practise;

import java.util.ArrayList;

/**
 * 发红包的人
 *
 */
public class Manager extends User {
    public Manager() {
    }
    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> sendPocket(int packetCount, int sendAmount){
        //这里集合的作用是存储若干个红包的金额
        ArrayList<Integer> arrayList = new ArrayList<>();
        //余额
        int leftmoney = super.getMoney();
        if(sendAmount > leftmoney){
            System.out.println("余额不足，请重新充值");
            return arrayList;
        }
        //设置金额
        super.setMoney(leftmoney - sendAmount);
        int avg = sendAmount / packetCount;
        int mod = sendAmount % packetCount;
        for (int i = 0; i < packetCount; i++) {
            if (i != arrayList.size() - 1) {
                arrayList.add(avg);
            } else {
                arrayList.add(avg + mod);
            }
        }
        return arrayList;
    }
}

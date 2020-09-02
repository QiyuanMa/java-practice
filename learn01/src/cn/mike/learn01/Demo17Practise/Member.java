package cn.mike.learn01.Demo17Practise;

import java.util.ArrayList;
import java.util.Random;

//接收红包
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    /**
     * 接收参数：ArrayList
     * 返回值：无
     * 方法名：void receivePocket
     */
    public void receivePocket(ArrayList<Integer> redList) {
        //随机生成redList中索引
        int index = new Random().nextInt(redList.size());
        //取出该索引对应的金额，并从列表中移除
        int remove = redList.remove(index);
        //检查成员原来余额
        int leftmoney = super.getMoney();
        //设置领取红包后余额
        super.setMoney(leftmoney + remove);
    }
}

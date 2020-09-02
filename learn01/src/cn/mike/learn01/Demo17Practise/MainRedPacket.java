package cn.mike.learn01.Demo17Practise;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Member member1 = new Member("mua1",100);
        Member member2 = new Member("mua2",200);
        Member member3 = new Member("mua3",300);
        Member member4 = new Member("mua4",400);
        member1.show();
        member2.show();
        member3.show();
        member4.show();
        System.out.println("=========");
        Manager manager1 = new Manager("ma1",500);
        ArrayList<Integer> list = manager1.sendPocket(4, 401);
        member1.receivePocket(list);
        member2.receivePocket(list);
        member3.receivePocket(list);
        member4.receivePocket(list);
        manager1.show();
        member1.show();
        member2.show();
        member3.show();
        member4.show();
    }
}

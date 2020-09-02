package cn.mike.learn01.demo02;

import org.w3c.dom.ls.LSOutput;

public class Phone {
    String brand;
    int price;
    String color;
    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }
}

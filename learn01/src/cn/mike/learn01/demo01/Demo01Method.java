package cn.mike.learn01.demo01;

import java.net.SocketOption;

public class Demo01Method {
    public static void main(String[] args) {
        sum(10,20);
    }
    public static int sum(int a, int b){
        System.out.println("方法执行啦");
        int result = a + b;
        return result;
    }
}

package cn.mike.learn01.demo07;

public class Demo03StringGet {
    public static void main(String[] args) {
        int length = "soinfaonfanf".length();
        System.out.println("字符串长度是：" + length);
        // 拼接字符串
        String string = "hello";
        String string2 = "World";
        String string3 = string.concat(string2);
        System.out.println(string);
        System.out.println(string2);
        System.out.println(string3);

        char ch = "Hello".charAt(1);
        System.out.println("1号索引位置的字符是：" + ch);
        System.out.println("============");

        String original = "HelloWorld";
        int llo = original.indexOf("llo");
        System.out.println("第一次索引是：" + llo);

        System.out.println("Hello Worl".indexOf("abc"));
    }
}

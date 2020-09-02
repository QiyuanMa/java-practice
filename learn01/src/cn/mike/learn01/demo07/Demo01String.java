package cn.mike.learn01.demo07;

public class Demo01String {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("第1个字符串：" + str1);

        char[] chars = {'A', 'B', 'C'};
        String str2 = new String(chars);
        System.out.println("第2个字符串：" + str2);

        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第3个字符串：" + str3);

        String string = "Hello";
        System.out.println("第4个字符串：" + string);
    }
}

package cn.mike.learn01.demo07;

public class Demo02StringEqual {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));
        System.out.println("Hello".equals(str1));

        String str4 = "hello";
        System.out.println(str4.equalsIgnoreCase(str1));

        String str5 = null;
        System.out.println("abc".equals(str5));
        System.out.println(str5.equals("abc"));
    }
}


package cn.mike.learn01.demo35StringBuilder;
/*
* StringBuilder和String可以相互转化
*   String->StringBuilder:
*       StringBuilder(String str)
*   StringBuilder->String:
*       public String toString():将当前StringBuilder对象转化为String对象*/
public class Demo03StringBuilder {
    public static void main(String[] args) {
        // String->StringBuilder
        String s = "hello";
        System.out.println(s);
        StringBuilder builder = new StringBuilder(s);
        builder.append(" world");
        System.out.println("builer:" + builder);
        //StringBuilder->String
        String str = builder.toString();
        System.out.println("str:" + str);

    }
}

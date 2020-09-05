package cn.mike.ListAndSet.demo02HashCode;
/*
*   hashCode方法源码：
*       public native int hashCode();
*       native: 表示该方法调用本地操作系统的方法*/
public class Demo01HashCode {
    public static void main(String[] args) {
        Person person1 = new Person();
        int h1 = person1.hashCode();
        System.out.println(h1);

        Person person2 = new Person();
        int h2 = person2.hashCode();
        System.out.println(h2);
        String s1 =new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());

    }
}

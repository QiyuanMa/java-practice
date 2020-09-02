package cn.mike.learn01.demo22;

public class Demo01MultiField {
    /*
    * 访问成员变量的两种方式：
    * 1. 直接通过对象名称访问成员变量，等号左边是谁优先用谁，不然向上
    * 2. 间接通过成员方法访问成员变量，看该方法属于谁，优先用谁，没有则向上找*/

    public static void main(String[] args) {
        //多态
        Fu obj = new Zi();
        System.out.println(obj.num);
        System.out.println("==============");
        //子类没有覆盖重写，就是父，子类覆盖重写，就是子
        obj.showNum();
    }
}

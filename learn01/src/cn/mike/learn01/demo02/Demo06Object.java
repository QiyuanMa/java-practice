package cn.mike.learn01.demo02;

public class Demo06Object {
    public static void main(String[] args) {
        Phone phone = new Phone();
        method(phone);

    }
//    带有static字段的 不需要对象，直接就能调用
    public static void method(Phone phone){
        System.out.println(phone.price);
        System.out.println(phone.color);
        System.out.println(phone.brand);

    }
}

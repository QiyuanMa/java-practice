package cn.mike.learn01.demo25;
/*
* 直接法访问成员内部类：
* 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
* */
public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();
        System.out.println("=========");
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}

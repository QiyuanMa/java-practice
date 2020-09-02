package cn.mike.learn01.demo25;

public class Outer {

    int num = 10;

    public class Inner {
        int num = 20;
        public void methodInner() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num); //内部类的成员变量
            System.out.println(Outer.this.num); //外部类的成员变量
        }
    }
}

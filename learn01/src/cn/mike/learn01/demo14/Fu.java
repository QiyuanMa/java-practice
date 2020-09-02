package cn.mike.learn01.demo14;

public class Fu {
    public Fu() {
//        父类构造函数，构造子类时也会调用
        System.out.println("父类构造方法！");
    }
    public Fu(int n) {
        System.out.println("带参数父类构造方法！");
    }
}

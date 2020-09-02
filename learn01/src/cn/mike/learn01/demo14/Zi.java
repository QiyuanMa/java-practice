package cn.mike.learn01.demo14;

public class Zi extends Fu {
    public Zi(){
//        子类构造函数
//        super(); 隐含这个
        super(20); // super()必须是子类构造方法的第一个语句，不能一个子类构造调用多次super构造
        System.out.println("子类构造方法！");
    }
    public void method(){
//        super();  错误写法，只有子类 构造方法 才能调用父类 构造方法
    }
}

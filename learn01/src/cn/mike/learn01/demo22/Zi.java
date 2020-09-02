package cn.mike.learn01.demo22;

public class Zi extends Fu{
    int num = 20;
    int age = 5;
    @Override
    public void method() {
        System.out.println("子类方法");
    }

    @Override
    public void showNum() {
        System.out.println(num);
    }
    public void methodZi(){
        System.out.println("子类特有方法");
    }
}

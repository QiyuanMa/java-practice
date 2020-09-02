package cn.mike.learn01.Demo16Abstract;

public class Zi extends Fu{
    public Zi(){
        System.out.println("子类构造方法执行！");
    }
    @Override
    public void eat() {
        System.out.println("Zi is eating");
    }
}

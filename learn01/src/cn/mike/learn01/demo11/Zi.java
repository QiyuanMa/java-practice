package cn.mike.learn01.demo11;

public class Zi extends Fu{
    int num = 20;
    public void method(){
        int num = 30;
        System.out.println("子类重名方法运行！");
        System.out.println("局部变量：" + num);
        System.out.println("本类的成员变量"+ this.num);
        System.out.println("父类的成员变量" + super.num);
    }
}

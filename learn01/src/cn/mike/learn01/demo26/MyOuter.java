package cn.mike.learn01.demo26;

public class MyOuter {
    public void methodOuter() {
        final int num = 10; // 所在方法的局部变量
        class MyInner {
            public void methodInnner() {
                System.out.println(num);
            }
        }
    }
}

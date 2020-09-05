package cn.mike.dataStructure.demo04Generic;

public class Demo03GenericMethod {
    public static void main(String[] args) {
        //创建GenericMethod对象
        GenericMethod gm = new GenericMethod();
        gm.method01(1);
        gm.method01("abc");
        gm.method01(0.1);
        gm.method01(true);

        GenericMethod.method02("静态方法，不建议创建对象使用");

    }
}

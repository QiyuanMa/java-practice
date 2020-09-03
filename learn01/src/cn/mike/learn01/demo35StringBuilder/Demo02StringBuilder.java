package cn.mike.learn01.demo35StringBuilder;
/*
* public StringBuilder apppend(...): 添加任意数据的字符串形式，并返回当前对象自身*/
public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        //使用append方法添加数据
        StringBuilder builder2 = builder.append("abc");  //把builder的方法赋值给builder2
        System.out.println(builder);
        System.out.println(builder2);
        System.out.println(builder == builder2);
        builder.append("123");
        builder.append(1);
        builder.append(true);
        builder.append(8.8);
        //链式编程
        builder.append("123").append(1).append(true).append(8.8);
        System.out.println(builder);
    }
}

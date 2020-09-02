package cn.mike.learn01.Demo19;
/*
* 接口中也可以使用成员变量，但必须使用public static final三个关键字修饰
* 即 接口的 ”常量“
* 格式：
* public static final 数据类型 常量名称 = 数据值;
* 备注：
* 一旦用final关键字进行修饰，说明不可改变，变量名用大写下划线的形式
*
* 注意事项：
* 接口中的常量，可以省略public static final，不写也照样是这样
* 接口中的常量，必须进行赋值，不能不赋值
* 接口中常量的名称，使用完全大写的字母，用下划线进行分隔*/
public interface MyInterfaceConst {
    public static final int NUM_OF_MY_CLASS = 10;


}

package cn.mike.dataStructure.demo04Generic;
/*
* 测试含有泛型的接口*/
public class Demo04GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl1 impl1 = new GenericInterfaceImpl1();
        impl1.method("字符串");

        GenericInterfaceImpl2<String> impl2 = new GenericInterfaceImpl2<>();
        impl2.method("abc");



    }
}

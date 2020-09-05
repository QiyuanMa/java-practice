package cn.mike.dataStructure.demo04Generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        GenericClass gc = new GenericClass();
        gc.setName("mua");
        Object name = gc.getName();
        System.out.println(name);

        //创建GenericClass对象，泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);
        Integer name2 = gc2.getName();
        System.out.println(name2);

        //创建GenericClass对象，泛型使用String类型
        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("xiao ming");
        String name3 = gc3.getName();
    }
}

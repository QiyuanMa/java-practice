package cn.mike.Thread.Lambda.p2;

import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
*   Lambda表达式有参数有返回值的练习
*   需求：
*       使用数组存储多个Person对象
*       对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序*/
public class Demo02Arrays {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("mua1",22),
                new Person("mua2", 14),
                new Person("mua3", 30)
        };
/*
        //对数组中的Person对象使用Arrays的sort方法通过年龄进行升序（前面-后面）排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/

        //使用Lambda表达式，简化匿名内部类
        Arrays.sort(arr, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });

        //使用优化Lambda表达式
        Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());

        //遍历数组
        for (Person person : arr) {
            System.out.println(person);
        }

    }
}

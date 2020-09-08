package cn.mike.dataStructure.demo05Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
* Comparator和Comparable区别
*   Comparable: 自己(this)和别人(参数)比较，自己需要实现Comparable接口，重写比较的规则compareTo方法
*   Comparator: 相当于找一个第三方的裁判，比较两个
*
* 排序规则：
*   o1-o2: 升序
*   02-01: 降序*/
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);

        list01.sort(new Comparator<Integer>() {
            //重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(list01);

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("mua1",22));
        list02.add(new Student("mua2",18));
        list02.add(new Student("mua4",20));
        list02.add(new Student("mua3",20));
        list02.sort(new Comparator<Student>() {
            //组合式比较
            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄升序排序
//                return o1.getAge() - o2.getAge();
                int result = o1.getAge() -o2.getAge();
                if(result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list02);
    }
}

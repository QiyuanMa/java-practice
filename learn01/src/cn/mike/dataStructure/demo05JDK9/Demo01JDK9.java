package cn.mike.dataStructure.demo05JDK9;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
*   JDK9新特性：
*       List接口，Set接口，Map接口：里边增加了一个静态的方法of，可以给集合一次性添加多个元素
*       static <E> List<E> of (E... elements)
*       使用前提：
*           当集合中存储的元素个数已经确定了，不再改变时使用
*   注意：
*       1. of方法只适用于List接口，Set接口，Map接口，不适用于接口的实现类
*       2. of方法返回值是一个不能改变的集合，集合不能再使用add, put方法添加元素，会抛出异常
*       3. Set接口和Map接口在调用of方法时不能有重复元素，否则会抛出异常*/
public class Demo01JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "a", "c", "d");
        System.out.println(list);
//        list.add("w"); //UnsupportedOperationException
//        Set<String> set = Set.of("a", "b", "a", "c", "d"); //IllegalArgumentException: duplicate element: a
        Set<String> set = Set.of("a", "b", "c", "d");
        System.out.println(set);

        Map<String, Integer> map = Map.of("mua1", 18, "mua2", 19,"mua3",22); //{mua1=18, mua2=19, mua3=22}
//        Map<String, Integer> map2 = Map.of("mua1", 18, "mua2", 19,"mua3",22,"mua1",20); //IllegalArgumentException: duplicate key: mua1
//        map.put("mua4",22); //UnsupportedOperationException
        System.out.println(map);
    }
}

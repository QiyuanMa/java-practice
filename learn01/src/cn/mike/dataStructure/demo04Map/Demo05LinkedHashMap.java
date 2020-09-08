package cn.mike.dataStructure.demo04Map;

import java.util.HashMap;
import java.util.LinkedHashSet;

/*
   java.util.LinkedHashMap<K,V> extends HashMap<K,V>
    Map接口的哈希表和链接列表实现，具有可预知的迭代顺序
    底层原理：
        哈希表+链表(记录元素的顺序)*/
public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        System.out.println(map); //key不允许重复，无序{a=d, b=b, c=c}

        HashMap<String,String> map2 = new java.util.LinkedHashMap<>();
        map2.put("a","a");
        map2.put("c","c");
        map2.put("b","b");
        map2.put("a","d");
        System.out.println(map2); //key不允许重复，有序{a=d, c=c, b=b}
    }
}

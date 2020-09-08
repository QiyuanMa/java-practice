package cn.mike.dataStructure.demo04Map;

import java.util.HashMap;
import java.util.Hashtable;

/*
* 单线程，速度慢
*   java.util.HashTable<K,V>集合 implements Map<K,V> 接口
*   HashTable：底层也是个哈希表，是线程安全的集合，是单线程的集合，速度慢
*   HashMap：底层是个哈希表，是线程不安全集合，多线程集合，速度快
*
*   HashMap集合（之前学的所有集合）：可以存储null值，null键
*   HashTable集合，不能存储null值，null键
*
*   HashTable和Vector集合一样，在jdk1.2版本后被更先进的集合(HashMap, ArrayList)取代了
*
*   HashTable子类Properties依然活跃在历史舞台，
*   Properties是唯一和IO流相结合的集合*/
public class Demo06HashTable {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null, null);
        System.out.println(map); //{null=null, b=null}

        Hashtable<String,String> table = new Hashtable<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null, null);
        System.out.println(table);
    }
}

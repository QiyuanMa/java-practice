package cn.mike.dataStructure.demo04Map;

import java.util.HashMap;
import java.util.Map;

/*
*  java.util.Map<k,v> 集合
*  Map集合特点：
*   1. Map集合是双列集合，一个元素包含两个值（一个key，一个value）
*   2. Map集合中的元素key和value数据类型可不同
*   3. key不能重复，value可重复（HashSet也不能重复元素，会先计算HashCode）
*   4. key和value一一对应
*  java.util.HashMap<k,v>集合 implements Map<k,v>空儿脸皮
*  HashMap集合特点：
*   1. HashMap集合底层是哈希表：查询速度快
*       JDK1.8前：数组+单向链表
*       JDK1.8后：数组+单向链表/红黑树（链表长度超过8）：提高查询速度
*   2. hashMap集合是一个无序集合，存储元素和取出元素的顺序可能不一致
*
*   java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
*   LinkedHashMap特点：
*       1. LinkedHashMap集合底层是哈希表+链表（保证迭代的速度）
*       2. LinkedHashMap集合是一个有序集合，存储元素和取出元素的顺序一致
*   */
public class Demo01Map {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }
    /*containsKey() 包含返回true，不包含返回false*/
    private static void show04() {
        Map<String,Integer> map = new HashMap<>();
        map.put("mua1", 168);
        map.put("mua2",165);
        map.put("mua3",178);
        boolean b1 = map.containsKey("mua2");
        System.out.println("b1:"+ b1);
    }

    /*
    *   public V get(Object key) 根据指定的键，在Map集合中获取对应的值
    *       返回值：
    *        key存在，v返回对应的值
     *       key不存在，v返回null   */
    private static void show03() {
        Map<String,Integer> map = new HashMap<>();
        map.put("mua1", 168);
        map.put("mua2",165);
        map.put("mua3",178);
        Integer v1 = map.get("mua2");
        System.out.println(v1);
    }

    /*
    * public V remove(Object key):  把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值
    *   返回值：V
    *       key存在，v返回被删除的值
    *       key不存在，v返回null*/
    private static void show02() {
        //创建Map集合对象
        Map<String,Integer> map = new HashMap<>();
        map.put("mua1", 168);
        map.put("mua2",165);
        map.put("mua3",178);
        System.out.println(map);
        Integer v1 = map.remove("mua3");
        System.out.println("v1:" + v1);

        System.out.println(map);

        Integer v2 = map.remove("mua3");
        System.out.println("v2:" + v2);
    }

    /*
*  public V put(K key, V value):
*       返回值：v
*           k不重复，返回null
*           k重复，替换，返回被替换的值*/
    private static void show01() {
        //创建Map集合对象，多态
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("key1", "mua");
        System.out.println("v1"+v1);
        String v2 = map.put("key1", "mua2");
        System.out.println("v2"+v2);

        System.out.println(map); //{key1=mua2}



    }
}

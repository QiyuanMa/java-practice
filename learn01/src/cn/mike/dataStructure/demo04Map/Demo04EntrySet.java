package cn.mike.dataStructure.demo04Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* Map集合的方法：
*   Set<Map.Entry<K,V>> entrySet()  返回此映射中包含的映射关系的 Set 视图
* 实现步骤：
*   1. 使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个Set集合中
*   2. 遍历Set集合，获取每一个Entry对象
*   3. 使用Entry对象中的方法getKey()和geValue()获取键与值
* */
public class Demo04EntrySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("mua1", 168);
        map.put("mua2",165);
        map.put("mua3",178);

        //1. 使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个Set集合中
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        //2. 遍历Set集合，获取每一个Entry对象
        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
        }
        System.out.println("==============");
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "->" + value);

        }
    }
}

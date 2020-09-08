package cn.mike.dataStructure.demo04Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
*   HashMap存储自定义类型键值
*   Map集合保证key是唯一的
*       作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一*/
public class Demo03HashMapSavePerson {
    public static void main(String[] args) {
        show01();
        show02();
    }
    /*
    *   HashMap存储自定义类型键值
    *   key: Person类型
    *   如果键是自定义类，要保证键唯一，必须在类中重写HashCode和equals*/
    private static void show02() {
        //创建HashMap集合
        HashMap<Person,String> map = new HashMap<>();
        //往集合中添加元素
        map.put(new Person("mua1",18),"英国");
        map.put(new Person("mua2",19),"秦国");
        map.put(new Person("mua3",20),"俄罗斯");
        map.put(new Person("mua1",18),"毛里求斯"); //Person类要重写HashCode和equals方法
        //使用entrySet和增强for遍历Map集合
        Set<Map.Entry<Person,String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"->"+value);
        }


    }

    /*
    * HashMap存储自定义类型键值
    * key: String类
    *      String类重写hashCode方法和equals方法，可以保证key唯一
    * value: Person类型
    *      value可以重复(同名同年龄的人视为同一个)*/
    private static void show01() {
        HashMap<String,Person> map = new HashMap<>();
        map.put("北京", new Person("mua1",18));
        map.put("上海", new Person("mua2",19));
        map.put("广州", new Person("mua3",20));
        map.put("北京", new Person("mua4",21));
        for (String key : map.keySet()) {
            Person value = map.get(key);
            System.out.println(key+ "-->" + value);
        }
    }

}

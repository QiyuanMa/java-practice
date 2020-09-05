package cn.mike.ListAndSet.demo01List;

import java.util.HashSet;
import java.util.Set;

/*
* extends Collection
*   不允许存储重复元素
*   没有索引，不能使用普通的for循环遍历
* HashSet集合
*   无序集合，存储元素和取出元素顺序可能不一致
*   底层哈希表结构，查询速度非常快
*   */
public class Demo03Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(2);
        set.add(3);
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}

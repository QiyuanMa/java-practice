package cn.mike.dataStructure.demo02Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* java.util.Iterator接口 接待器（对集合进行遍历）
* boolean hasNext() 判断集合中有没有下一个元素，如果仍有元素可以继续迭代，返回true
* E next() 返回迭代的下一个元素
*
* Iterator是接口，需要使用实现类
* Collection集合中的iterator接口返回迭代器对象
* Iterator<E> iterator()
* 使用步骤
* 1. 使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
* 2. 使用Iterator接口中的方法hasNext判断是否还有下一个元素
* 3。 使用Iterator接口方法next()取出下一个元素
* */
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("mua1");
        coll.add("mua2");
        coll.add("mua3");
        coll.add("mua4");

        Iterator<String> it = coll.iterator(); //初始指向集合的-1索引
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(Iterator<String> i2 = coll.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
/*        boolean b = it.hasNext();
        System.out.println(b);
        String s = it.next();
        System.out.println(s);
        */

    }
}

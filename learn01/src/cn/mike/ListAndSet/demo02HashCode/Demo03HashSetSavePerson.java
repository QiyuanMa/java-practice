package cn.mike.ListAndSet.demo02HashCode;

import java.util.HashSet;

public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("mua1",22);
        Person p2 = new Person("mua1",22);
        Person p3 = new Person("mua1",23);
        System.out.println(p1.hashCode()); //189568618 此时未重写equals和hashcode
        System.out.println(p2.hashCode()); //793589513
        System.out.println(p1.equals(p2));
        set.add(p1);// override equals()和hashcode()后认定是同一元素
        set.add(p2);
        set.add(p3);
        System.out.println(set);



    }
}

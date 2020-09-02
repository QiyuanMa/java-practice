package cn.mike.learn01.demo31Object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //重写toString返回属性
   /* @Override
    public String toString() {
//        return super.toString();
        return "Person{name = " + name + " age = " + age + "}";
    }*/

/*    @Override
    public boolean equals(Object obj) {
        //增加判断本身（目标提升程序效率）
        if(obj == this){
            return true;
        }
        //增加判断判空
        if(obj == null){
            return false;
        }
        //增加一个判断，防止类型转换一次ClassCastException
        if(obj instanceof Person){
            //向下转型，obj转换为Person类型
            Person person = (Person) obj;
            //比较两个对象的属性，一个对象是this(p1)，一个对象是p(obj->p2)
            boolean b = this.name.equals(person.name) && this.age == person.age;
            return b;
        }
        //不是Person类型，返回false
        return false;
    }*/

    //equals优化上述写法

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name); // Objects对象的equals方法可以防止空指针异常
    }
}

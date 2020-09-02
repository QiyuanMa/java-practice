package cn.mike.learn01.demo04;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("构造方法 无参");
    }
    public Person(String name, int age){
        System.out.println("构造方法 全参");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void sayHello(String name){
        System.out.println(name+"你好，我是"+this.name);
    }
}

package cn.mike.learn01.demo08;

public class Student {
    private int id;
    private int age;
    private String name;
    static String room = "所在教室";
    private  static int idCounter = 0;

    public Student() {
        this.id = ++idCounter;
    }
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        this.id = ++idCounter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

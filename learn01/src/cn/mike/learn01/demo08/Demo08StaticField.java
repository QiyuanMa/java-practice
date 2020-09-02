package cn.mike.learn01.demo08;

public class Demo08StaticField {
    public static void main(String[] args) {
        Student one = new Student(22, "mua");
        one.room = "101教室";
        System.out.println("姓名：" + one.getName() +
                "，年龄：" + one.getAge()+"，教室" + one.room+
                "，编号：" + one.getId());
        Student two = new Student(23, "vincent");
        System.out.println("姓名：" + two.getName() +
                "，年龄：" + two.getAge()+"，教室" + two.room+
                "，编号：" + two.getId());
    }
}

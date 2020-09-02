package cn.mike.learn01.demo02;

public class Person {
    String name;
    private int age;

    public void setAge(int age) {
        if(age < 100 && age > 0){
            this.age = age;
        }else{
            System.out.println("数据不合理");
        }
    }

    public int getAge() {
        return age;
    }
    public void show(){
        System.out.println("我叫："+ name +" 年龄" + age);
    }
}

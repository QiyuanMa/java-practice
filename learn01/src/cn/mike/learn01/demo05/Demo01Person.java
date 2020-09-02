package cn.mike.learn01.demo05;

public class Demo01Person {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        Person person1 = new Person("迪丽热巴",18);
        Person person2 = new Person("古力娜扎", 28);
        Person person3 = new Person("玛尔扎", 38);
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;

        System.out.println(people[0]);
        System.out.println(people[1]);
        System.out.println(people[2]);

        Person person = people[1];
        System.out.println(person.getName());
        System.out.println(people[1].getName());

    }
}

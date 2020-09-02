package cn.mike.learn01.Demo17Practise;

public class User {
    private String name;
    private int money;

    public User() {
    }

    public void show() {
        System.out.println("姓名：" + name + "余额：" + money);
    }
    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}



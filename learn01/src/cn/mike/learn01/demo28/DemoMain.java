package cn.mike.learn01.demo28;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("mua");
        hero.setAge(22);

        Weapon weapon = new Weapon("霜之哀伤");

        hero.setWeapon(weapon);
        hero.attack();

    }
}

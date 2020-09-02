package cn.mike.learn01.demo29;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");

        //设置英雄技能
        hero.setSkill(new SkillImpl());

        //或 匿名内部类
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("piu-piu-piu-piu");
            }
        };
        hero.setSkill(skill);

        //匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("ca-ca-ca");
            }
        });
        hero.attack();
    }
}

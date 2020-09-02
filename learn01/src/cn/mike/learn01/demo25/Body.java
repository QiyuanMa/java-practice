package cn.mike.learn01.demo25;

public class Body { //外部类

    public class Heart { //成员内部类
        //内部类的方法
        public void beat() {
            System.out.println("心脏跳动，蹦蹦蹦");
            System.out.println("我叫：" + name);
        }
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodBody(){
        System.out.println("外部类的方法");
        new Heart().beat();
    }
}

package cn.mike.learn01.demo22;

import cn.mike.learn01.Demo16Abstract.Animal;

import java.util.jar.Manifest;

/*
编译看左，运行看右
* */
public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method(); //父子都有，优先用子
        obj.methodFu(); //子没有，向上找父
        System.out.println("=========");
        //还原，向下转型
/*        Zi zi = (Zi) obj;
        zi.methodZi();*/
        System.out.println("==========");
        //对象的向下转型，一定要进行instanceof判断
        if(obj instanceof Fu){
            Zi zi = (Zi) obj;
            zi.methodZi();
        }
        giveMeAZi(new Zi());
    }
    public static void giveMeAZi(Fu fu) {
        if(fu instanceof Zi) {
            Zi zi = (Zi) fu;
            zi.methodZi();
        }
    }
}

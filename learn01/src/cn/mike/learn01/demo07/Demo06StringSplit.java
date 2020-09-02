package cn.mike.learn01.demo07;

import javax.naming.PartialResultException;

public class Demo06StringSplit {
    public static void main(String[] args) {
        String string = "aaa,bbb,ccc";
        String[] split = string.split(",");
        for (String s : split) {
            System.out.println(s);
        }
        System.out.println("=======");
        String string2 = "aaa bbb ccc";
        String[] s = string2.split(" ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        System.out.println("=======");

        String string3 = "XXX.YYY.ZZZ";
        String[] split1 = string3.split("\\.");  //如果用英文符号"."进行切分，必须用//.
        System.out.println(split1.length);
        for (int i = 0; i < split1.length; i++) {
            System.out.println(split1[i]);
        }
    }
}

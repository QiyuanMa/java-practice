package cn.mike.learn01.demo05;
import java.util.Scanner;
public class Demo01Scanner {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
/*        new Scanner(System.in).nextInt();
        methodParam(new Scanner(System.in));
        System.out.println("输入的数字是："+num);
        String string = scanner.next();
        System.out.println("输入的字符串是"+string);*/
        Scanner aReturn = methodReturn();
        int i = aReturn.nextInt();
        System.out.println("返回值是:"+i);
    }
    public static void methodParam(Scanner scanner){
        int num = scanner.nextInt();
        System.out.println("输入的是："+num);
    }
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }


}

package cn.mike.Exception.MyException;

import java.util.Scanner;

/*
*   要求： 我们模拟注册登录，如果用户名已存在，则抛出异常并提示：该用户名已经被注册
*
*   分析：
*       1. 使用数组保存已经注册过的用户名（数据库）
*       2. 使用Scanner获取用户输入的注册的用户名（前端，网页）
*       3. 定义一个方法，对用户输入的注册的用户名进行判断
*           遍历存储已经注册过用户名的数组，获取每一个用户名
*           使用获取到的用户名和用户输入的用户名比较
*               true:
*                   用户名已经存在，抛出RegisterException异常，告知用户“亲，该用户名已经被注册”
*               false:
*                   继续遍历比较
*           如果循环结束还没有找到重复的用户名，提示用户"恭喜您注册成功" */
public class Demo01RegisterException {
    //使用数组保存已经注册过的用户名（数据库）
    static String[] usernames = {"mua1", "mua2", "mua3"};
    public static void main(String[] args) /*throws RegisterException*/ {
        //使用Scanner获取用户输入的注册的用户名（前端，网页）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名");
        String username = sc.next();
        checkUsername(username);
    }
    //3. 定义一个方法，对用户输入的注册的用户名进行判断
    public static void checkUsername(String username) /*throws RegisterException*/ {
        //遍历存储已经注册过用户名的数组，获取每一个用户名
        for (String name : usernames) {
            if(name.equals(username)) {
                try {
                    throw new RegisterException("该用户已经被注册");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        //如果循环结束还没有找到重复的用户名，提示用户"恭喜您注册成功"
        System.out.println("恭喜您注册成功");
    }
}

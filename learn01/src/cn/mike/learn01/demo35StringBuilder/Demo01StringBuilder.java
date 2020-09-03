package cn.mike.learn01.demo35StringBuilder;
/*java.lang.StringBuiler类：字符串缓冲区，可以提高字符串的效率
* 构造方法：
*   StringBuilder()
*   构造一个不带任何字符的字符串生成器，初始容量为16个字符。
*   StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容*/
public class Demo01StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println("builder:" + builder);

        StringBuilder builder2 = new StringBuilder("abc");
        System.out.println("builder2:"+ builder2);
    }
}

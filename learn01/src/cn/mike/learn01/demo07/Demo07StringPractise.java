package cn.mike.learn01.demo07;
/*分析：
* 1.首先准备一个字符数组int[]，内容是 1,2,3
* 2.定义一个方法，用来将数组转化成字符串
* 三要素：
* 返回值类型：String
* 方法名称：fromArrayToString
* 参数列表：int[]
* 用到：for循环，字符串拼接，每个 数组元素前面都有一个word字样，分割使用#，区分是不是最后一个
* */
public class Demo07StringPractise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        String result = fromArrayToString(array);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] array){
        String string = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){
                string += "word" + array[i] + "]";
            } else {
                string +="word"+array[i]+"#";
            }
        }
        return  string;
    }
}

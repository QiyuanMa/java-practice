package cn.mike.learn01.demo09;
/*分析：
* 确定范围，for循环
* 起点位置-10.8应该转化为-10，两种方法：
* 2.1 Math.ceil方法，向上取整
* 2.2 强制为int*/
public class Demo04MathPractise {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        for(int i = (int)min; i < max; i++){
            int abs = Math.abs(i);
            if(abs > 6 || abs < 2.1){
                System.out.println(abs);
                count++;
            }
        }
        System.out.println("总共有：" + count + "个");
    }
}

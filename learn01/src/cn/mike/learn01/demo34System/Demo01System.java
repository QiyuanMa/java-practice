package cn.mike.learn01.demo34System;

import java.util.Arrays;

public class Demo01System {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        //使用System中arrayCopy方法将原数组前三个元素复制到目标数组的前三个位置上
        System.out.println("复制前：" + Arrays.toString(dest));
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("复制后：" + Arrays.toString(dest));
    }

    private static void demo01() {
        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {

        }
        long millis = System.currentTimeMillis();
        System.out.println("耗时" + (millis - currentTimeMillis)+"毫秒");
    }
}

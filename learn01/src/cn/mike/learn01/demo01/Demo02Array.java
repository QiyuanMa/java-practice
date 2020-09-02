package cn.mike.learn01.demo01;

public class Demo02Array {
    public static void main(String[] args) {
        int[] arrayA = {5, 12, 13};

        System.out.println(arrayA);
        printArray(arrayA);
    }

    public static void printArray(int[] array) {
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

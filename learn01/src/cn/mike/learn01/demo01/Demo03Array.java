package cn.mike.learn01.demo01;

public class Demo03Array {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);
        printArray(result);

    }
    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum/3;
        int[] array = {sum, avg};
        return array;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

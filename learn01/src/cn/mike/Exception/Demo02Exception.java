package cn.mike.Exception;
/*
*   异常的产生过程解析（分析异常如何产生，如何处理）*/
public class Demo02Exception {
    public static void main(String[] args) {
        //创建int型数组，并赋值
        int[] arr = {1,2,3};
        int e = getElement(arr, 3);
        System.out.println(e);
    }
    /*
    * 定义一个方法，获取数组指定索引处的元素
    * 参数：
    *   int[] arr
    *   int index*/
    public static int getElement(int[] arr, int index) {
        int ele = arr[index];
        return ele;
    }
}

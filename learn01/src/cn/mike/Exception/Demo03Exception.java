package cn.mike.Exception;

import java.util.List;

public class Demo03Exception {
    public static void main(String[] args) {
        //多个异常，多次处理
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try{
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        //多个异常，一次处理

        // catch中异常处理若存在子父类关系，子类的异常处理必须写在上面，否则报错
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("后续代码");

        //多个catch，一次捕获，一次处理
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("后续代码");

    }


}

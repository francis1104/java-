package com.itheima.hf.homework;
//设计一个方法用于数组遍历,要求遍历结果是在一行上的.例如:[11,22,33,44,55]
public class MethodTest01 {
    public static void main(String[] args) {
        int[] arr = {11, 12, 23, 35, 56, 67};
        looparr(arr);
        System.out.println("白日依山尽");
    }

    public static void looparr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            }else {
                System.out.print(arr[i] + ",");
            }
        }
    }

}

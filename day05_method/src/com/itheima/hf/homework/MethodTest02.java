package com.itheima.hf.homework;

//设计一个方法用于求数组最大值
public class MethodTest02 {
    public static void main(String[] args) {
        int[] arr = {11, 12, 67, 35, 56, 23};
        int max = getmax(arr);
        System.out.println(max);
    }

    public static int getmax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


}

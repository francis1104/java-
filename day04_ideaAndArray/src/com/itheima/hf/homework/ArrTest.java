package com.itheima.hf.homework;

public class ArrTest {
    public static void main(String[] args) {
//        int[] arr = new int[7];     动态初始化数组======>已知数组长度
//      数据类型[] 数组名 = new 数据类型[数组长度];
        int[] arr1 = {1, 2, 34, 45, 345, 3};//静态初始化数组=======>已知数组数据
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println(max);
    }
}

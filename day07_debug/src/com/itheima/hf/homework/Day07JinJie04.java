package com.itheima.hf.homework;

/*4、定义方法，参数为整数数组与指定元素，判断数组中有多少个能整除指定元素的，在主方法中输出。
数组int[] arr = {12,43,45,76,78,98,23,21,34,56};指定元素为2；*/
public class Day07JinJie04 {
    public static void main(String[] args) {
        int[] arr = {12, 43, 45, 76, 78, 98, 23, 21, 34, 56};
        int i = 2;
        System.out.println(function(arr, i));
    }
    public static int function(int[] arr, int a) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % a == 0) {
                count++;
            }
        }
        return count;
    }
}

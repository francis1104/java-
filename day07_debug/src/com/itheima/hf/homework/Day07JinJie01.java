package com.itheima.hf.homework;

import java.util.Random;

/***1、定义 changeNewArr(int[] arr)静态方法:要求传入一个int类型的数组arr,遍历数组，
 * 将数组中小于10**的元素替换成0。
 在main方法中完成:
 ​   1. 定义一个长度为5的int类型的数组
 ​   2. 随机生成5个随机数存入数组(随机数的范围为5到50,包括5和50)，并把数组中的元素打印在控制台
 ​   3. 调用changeNewArr方法,在控制台打印修改后数组的元素。*/
public class Day07JinJie01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        changeNewArr(arr);
        System.out.println("修改后的数组:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    private static void changeNewArr(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(46) + 5;
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {
                arr[i] = 0;
            }
        }
    }

}

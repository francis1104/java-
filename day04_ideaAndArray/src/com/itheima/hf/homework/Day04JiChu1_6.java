package com.itheima.hf.homework;

import java.util.Scanner;

/*
* 有一个数组，其中有十个元素从小到大依次排列
* {12,14,23,45,66,68,70,77,90,91}。再通过键盘录入一个整数数字。
* 要求：把数字放入数组序列中，生成一个新的数组，
* 并且数组的元素依旧是从小到大排列的。执行效果如下：
*请输入一个整数数字：
    50
    生成的新数组是：12 14 23 45 50 66 68 70 77 90 91
* */
public class Day04JiChu1_6 {
    public static void main(String[] args) {
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] brr = new int[11];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();//用户输入的数
        int index = 0;//
        for (int i = 0; i < arr.length; i++) {
            if (num > arr[i] && num <= arr[i + 1]) {
                index = i + 1;
            }
        }
        System.out.println("index = " + index);
        for (int i = 0; i < arr.length; i++) {
            if (i >= index){
                brr[i+1]=arr[i];
            }else {
                brr[i]= arr[i];
            }
        }
        brr[index] = num;
        System.out.println("新的数组是:");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
    }
}

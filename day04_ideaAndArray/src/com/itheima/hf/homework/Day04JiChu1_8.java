package com.itheima.hf.homework;

import java.util.Random;

/*
 * 定义一个数组其中包含多个数字。用自己的方式最终实现，
 * 奇数放在数组的左边，偶数放在数组的右边。
 * （可以创建其他数组，不必须在原数组中改变）*/
public class Day04JiChu1_8 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10) + 1;
        }
        System.out.println("随机的十个数为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        // e   e   o   o   e   e   e   o   e   o
                   // 23  45  77 91 90  70  68  66  14   12
//        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] brr = new int[10];
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                brr[left] = arr[i];
                left++;
            } else {
                brr[right] = arr[i];
                right--;
            }
        }
        System.out.println();
        System.out.println("奇数靠左偶数靠右:");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
    }
}

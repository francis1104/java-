package com.itheima.hf.test3_6;

import java.util.Random;

/*定义一个数组其中包含多个数字。
用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。
（可以创建其他数组，不必须在原数组中改变）*/
public class Test04 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        System.out.println("十个随机数:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] brr = new int[10];
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                brr[left] = arr[i];
                left++;
            }else {
                brr[right] = arr[i];
                right--;
            }
        }
        System.out.println("brr:");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
    }
}

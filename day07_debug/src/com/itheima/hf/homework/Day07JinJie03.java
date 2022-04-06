package com.itheima.hf.homework;

import java.util.Random;

/***3、在主方法中定义一个长度为10的数组，数组中元素使用随机数赋值，
 * 随机数范围为23-57（包括23与57）判断偶数的个数，并输出
 */
public class Day07JinJie03 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(35) + 23;
            System.out.println(arr[i]);
        }
        int evenNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNum++;
            }
        }
        System.out.println("evenNum = " + evenNum);
    }
}

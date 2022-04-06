package com.itheima.hf.homework;

import java.util.Random;

/*5、定义一个长度为5的数组arr1，用于存放5个1~9的随机整数（范围包含1和9），
再定义一个长度为2的数组arr2，统计arr1中的元素对2求余等于0的个数,保存到arr2[0],
统计arr1中的元素对3求余等于0的个数,保存到arr2[1],在控制台打印输出arr2的所有元素*/
public class Day07JinJie05 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[2];
        Random r = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(9) + 1;
            System.out.println(arr1[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr2[0]++;
            }
            if (arr1[i] % 3 == 0) {
                arr2[1]++;
            }
        }
        System.out.println("arr2[0] = " + arr2[0]);
        System.out.println("arr2[1] = " + arr2[1]);
    }
}

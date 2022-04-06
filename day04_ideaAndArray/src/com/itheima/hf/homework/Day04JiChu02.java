package com.itheima.hf.homework;

import java.util.Random;
/***2．需求：求出数组中索引与索引对应的元素都是奇数的元素**

 **分析：**

 ​	1、遍历数组

 ​	2、判断索引是否是奇数（索引 % 2 != 0）

 ​	3、判断索引对应的元素是否是奇数(arr[索引] % 2 != 0)

 ​	4、满足条件输出结果*/
public class Day04JiChu02 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10) + 1;
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println("数组中奇数索引为:"+i);
            }
            if (arr[i] % 2 != 0) {
                System.out.println("数组中奇数值为:"+arr[i]);
            }
        }
    }
}

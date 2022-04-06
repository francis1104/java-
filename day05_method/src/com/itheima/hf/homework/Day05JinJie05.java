package com.itheima.hf.homework;

import java.util.Random;

/***5、定义功能，将数组中的0元素，使用1-10之间的随机数替换掉。**
 ​	数组: int[] arr = {1,43,43,5,4,6,6,7,7,88,9,9,9,0,0,9};
 **分析：**
 ​	参数： 需要替换元素的数组。
 ​	返回值：不需要，因为传递给方法的是数组的地址
 ​	1、对数组进行遍历
 ​	2、创建随机数，用来替换0元素
 ​	3、对取出的每个数组数据进行判断，是否为0元素
 ​	4、如果元素为0，则使用随机数进行重新赋值*/
public class Day05JinJie05 {
    public static void main(String[] args) {
        int[] arr = {1, 43, 43, 5, 4, 6, 6, 7, 7, 88, 9, 9, 9, 0, 0, 9};
        testReplace(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void testReplace(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i]=r.nextInt(10)+1;
            }
        }
    }
}

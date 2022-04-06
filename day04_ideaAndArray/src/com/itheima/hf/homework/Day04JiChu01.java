package com.itheima.hf.homework;
/***1.定义一个含有五个元素的数组,并为每个元素赋值,求数组中所有元素的最小值**

 **操作步骤：**

 ​	1.定义5个元素数组

 ​	2.可以使用初始化数组的两种方式之一为数组元素赋值

 ​	3.遍历数组求数组中的最小值*/
public class Day04JiChu01 {
    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 6, 8};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        System.out.println("min = " + min);
    }
}

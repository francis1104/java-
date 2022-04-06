package com.itheima.hf.homework;
/***4、定义功能，计算出数组中指定元素出现的次数。**
 ​	数组: int[] arr = {1,43,43,5,4,6,6,7,7,88,9,9,9,0,0,9};
 ​	指定元素: int x = 9;
 **分析：**
 ​	参数： 需要。统计的数组和执行的元素。
 ​	返回值：需要，执行元素的个数。int类型
 ​	1、对数组进行遍历
 ​	2、对取出的每个数组数据进行判断，是否和指定元素相等
 ​	3、如果相等则记录一次，因此需要一个计数器变量
 ​	4、比较结束后返回记录的结果。*/
public class Day05JinJie04 {
    public static void main(String[] args) {
        int[] arr = {1,43,43,5,4,6,6,7,7,88,9,9,9,0,0,9};
        int x = 9;
        int count = testNum(arr,x);
        System.out.println("count = " + count);
    }

    public static int testNum(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                count++;
            }
        }
        return count;
    }
}

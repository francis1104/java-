package com.itheima.hf.homework;

import java.util.Random;

/*小明去彩票站买彩票，随机一注双色球。使用数组存储小明的随机的彩票数字。 双色球规则 ：有6个红球加1个蓝
球，每个红球的范围是[1-32]， 蓝球的范围是[1-16]， 红球之间的数字不可重复，蓝球是可以和红球重复的,用数组存
储7个元素(数组中的元素,不考虑排序问题)
控制台效果，举例如下：红球为 : 8 29 21 31 12 5 蓝球为 : 14
*/
public class Day04KuoZhan04 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Random r = new Random();

        for (int i = 0; i < arr.length - 1; i++) {
            int random = r.nextInt(32) + 1;
            arr[i] = random;
        }
        System.out.println("--------------------");
        //检测每一个数是否重复
        for (int i = 0; i < arr.length - 1; i++) {
            for (int i1 = 0; i1 < arr.length - 1; i1++) {
                if (arr[i] == arr[i1]) {
                    if (i == i1) {//不能和自己比较
                        continue;
                    }
                    arr[i] = r.nextInt(32) + 1;
                }
            }
        }
        arr[arr.length - 1] = r.nextInt(16) + 1;//设置蓝球的范围,赋值
        System.out.println("red ball is :");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.println();
                break;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println("blue ball is :"+arr[arr.length-1]);
    }
}

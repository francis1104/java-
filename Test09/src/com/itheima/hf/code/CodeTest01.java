package com.itheima.hf.code;

import java.util.Random;

/*1：随机生成六个1-10（包含10）之间的数存入数组中,然后计算出去掉最大值与最小值的平均数*/
public class CodeTest01 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[6];
        System.out.println("组中的数据为:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10) + 1;
            System.out.print(arr[i]+" ");
        }
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
            sum+=arr[i];
        }
        System.out.println();
        System.out.println("最大值为:" + max);
        System.out.println("最小值为:" + min);
        System.out.println("平均值为:" + (sum/arr.length));


    }
}

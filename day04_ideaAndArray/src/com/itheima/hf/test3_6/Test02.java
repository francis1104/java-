package com.itheima.hf.test3_6;

import java.util.Random;

/*创建一个长度为6的整数数组。请编写代码，
随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，
然后计算出数组中所有元素的和并打印。
* */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(100);
            System.out.println(arr[i]);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
    }
}

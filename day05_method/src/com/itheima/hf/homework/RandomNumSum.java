package com.itheima.hf.homework;

import java.util.Random;

/*随机产生两个整数,随机数的范围均是[50,100],定义方法求这两个整数的和并打印和值*/
public class RandomNumSum {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(51) + 50;
        int num2 = r.nextInt(51) + 50;
        getSum(num1,num2);
    }

    public static void getSum(int num1, int num2) {
        System.out.println(num1+num2);
    }
}

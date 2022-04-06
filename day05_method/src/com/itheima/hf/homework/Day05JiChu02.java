package com.itheima.hf.homework;

import java.util.Random;

/*2 随机产生两个整数,随机数的范围均是[1,100],定义方法求这两个整数的和并打印和值
	操作步骤描述
	1.创建一个测试类
	2.在主方法中使用随机数产生两个范围是[1,100]的随机数
	3.定义一个求两个整数和的方法
	4.在主方法中调用这个求和方法得到结果值,并打印*/
public class Day05JiChu02 {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(100) + 1;
        int num2 = r.nextInt(100) + 1;
        int sum = testSum(num1, num2);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("sum = " + sum);
    }

    private static int testSum(int num1, int num2) {
        return num1 + num2;
    }
}

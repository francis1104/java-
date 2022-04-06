package com.itheima.hf.test3_6;

import java.util.Random;

/*
 * 定义int类型的变量a,定义int类型的变量b,a和b的值由随机数产生，
 * 范围: 55-88之间,使用三元运算符判断如果a大于b返回a与b的和,
 * 否则返回a与b的乘积,打印结果
 * */
public class Test01 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(34) + 55;
        int b = r.nextInt(34) + 55;
        int resort = (a > b) ? a + b : a * b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("resort = " + resort);
    }
}

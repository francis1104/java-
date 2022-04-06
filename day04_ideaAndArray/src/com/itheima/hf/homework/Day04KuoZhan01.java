package com.itheima.hf.homework;

import java.util.Random;

/*
* 小明的支付宝中有30个好友在玩蚂蚁森林,
* 这30人的每日生成的能量以随机数产生
* (随机数的范围[1,100]),小明是个有
原则的人 ,5以下的能量会放过.
* 问小明今日可以偷走多少能量?(不考虑偷不走的情况)
控制台效果,举例如下 :
* */
public class Day04KuoZhan01 {
    public static void main(String[] args) {
        int[] arr = new int[30];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100)+1;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=5){
                sum += arr[i];
            }
        }
        System.out.println("今日小明偷走好友"+sum+"能量");


    }
}

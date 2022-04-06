package com.itheima.hf.homework;

import java.util.Scanner;

/*
 * 6个评委给选手打分,分数为0-100整数
 * 选手最后得分为:去掉最高最低后的平均值(不考虑小数).
 * */
public class ScoreTest {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请给" + (i + 1) + "号选手打分:");
            int score = sc.nextInt();
            if (score > 0 && score <= 100) {
                arr[i] = score;
            } else {
                System.out.println("您输入的分数有误!");
                i--;
            }
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int avg = (sum - max - min)/(arr.length-2);
        System.out.println("最终分数为 : " + avg);

    }
}

package com.itheima.hf.homework;

import java.util.Random;
import java.util.Scanner;

/***5.定义一个长度为20的数组，元素为20-40的随机数，
 * 要求判断指定元素在数组中出现的次**数
 * ，指定元素为键盘录入范围为20-40之间。
 */
public class Day04JiChu05 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(21) + 20;
            System.out.println(arr[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数20-40之间");
        int num = sc.nextInt();
        while (num > 40 || num < 20) {
            System.out.println("不合法,重输");
            num = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                count++;
            }
        }
        System.out.println("count = " + count);

    }
}

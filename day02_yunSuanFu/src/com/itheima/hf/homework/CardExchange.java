package com.itheima.hf.homework;

import java.util.Scanner;

public class CardExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明左手中的纸牌:");
        int left = sc.nextInt();
        System.out.println("请输入小明右手中的纸牌:");
        int right = sc.nextInt();
        System.out.println("互换前小明中的纸牌:");
        System.out.println("左手中的纸牌:"+left);
        System.out.println("右手中的纸牌:"+right);
        int temp = left;
        left = right;
        right = temp;
        System.out.println("互换后小明中的纸牌:");
        System.out.println("左手中的纸牌:"+left);
        System.out.println("右手中的纸牌:"+right);


    }
}

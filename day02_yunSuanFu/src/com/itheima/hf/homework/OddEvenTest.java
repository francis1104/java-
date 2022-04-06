package com.itheima.hf.homework;

import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("奇偶测试,请输入一个整数:");
        int i = sc.nextInt();
        System.out.println((i%2==0) ? "even" : "odd");
    }
}

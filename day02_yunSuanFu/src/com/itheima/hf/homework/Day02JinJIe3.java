package com.itheima.hf.homework;

import java.util.Scanner;

public class Day02JinJIe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0 ){
            System.out.println("是闰年");
        }else{
            System.out.println("不是");
        }
    }
}

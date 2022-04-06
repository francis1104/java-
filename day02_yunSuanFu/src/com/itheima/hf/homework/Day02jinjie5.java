package com.itheima.hf.homework;

import java.util.Scanner;

public class Day02jinjie5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个5位数:");
        int i = 0;
        while (true){
            int heGe = sc.nextInt() ;
            if (heGe >= 10000 && heGe <= 99999){

                i = heGe;
                break;
            }
            System.out.println("您输入的不是5位数,请重新输入:");
        }

        int ge = i % 10;
        int shi = i / 10 % 10;
        int qian = i / 1000 % 10;
        int wan = i / 10000 % 10;
        if(ge == wan && shi == qian){
            System.out.println("是一个回文数");
        }else{
            System.out.println("不是一个回文数");
        }
    }
}

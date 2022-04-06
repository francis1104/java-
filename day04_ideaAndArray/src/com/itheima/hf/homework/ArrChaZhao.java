package com.itheima.hf.homework;

import java.util.Scanner;
//已知数组arr = {19,28,37,46,50};键盘录入一个数据,查找索引
public class ArrChaZhao {
    public static void main(String[] args) {
        int[] arr = {19,28,37,46,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请查找一个数");
        int a = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]){
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);
    }
}

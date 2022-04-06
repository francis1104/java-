package com.itheima.hf.homework;

import java.util.Scanner;

public class Day03KuoZhan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入初始瓜子个数:");
        int seeds =sc.nextInt();
        int count = 0;

        while (seeds>1){
            if(seeds % 2==0){
                seeds/=2;
                count++;
            }else {
                seeds=seeds*3+1;
                count++;
            }
        }
        System.out.println("需要经过:"+count+"次变化,瓜子数为"+seeds);
    }
}

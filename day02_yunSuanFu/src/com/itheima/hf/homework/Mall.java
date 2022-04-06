package com.itheima.hf.homework;

import java.util.Scanner;

public class Mall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xiShouYePrice = 5.0;
        double mianBoGanPrice = 6.0;
        double xsyTotal =1.0;
        double mbgTotal =1.0;
        System.out.println("请输入要购买的洗手液数量:");
        int xiShouYeNum = sc.nextInt();
        System.out.println("请输入要购买的面包干数量:");
        int mianBaoGanNum = sc.nextInt();
        if(xiShouYeNum >= 2){
             xsyTotal = xiShouYeNum * xiShouYePrice*0.9;
        }else{
             xsyTotal = xiShouYeNum * xiShouYePrice;
        }
        if(mianBaoGanNum >= 2){
             mbgTotal = mianBaoGanNum * mianBoGanPrice*0.8;
        }else {
             mbgTotal = mianBaoGanNum * mianBoGanPrice;
        }
        System.out.println("总价为:"+(mbgTotal+xsyTotal));
    }
}

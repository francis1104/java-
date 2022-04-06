package com.itheima.hf.homework;

import java.util.Scanner;
/*
 某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，
 到期凭存单支取本息。存款年利率表如下：
 存期		年利率（%）
	一年		2.25
	两年		2.7
	三年		3.25
	五年		3.6
请存入一定金额，存一定年限（四选一），计算到期后得到的本息总额。
提示：
 存入金额和存入年限均由键盘录入
 本息计算方式：本金+本金×年利率×年限
 */

public class DepositSystem {
    public static void main(String[] args) {
        System.out.println("银行存储系统1.0");
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择存期:");
        System.out.println("1.一年,利率为2.25");
        System.out.println("2.两年,利率为2.7");
        System.out.println("3.三年,利率为3.25");
        System.out.println("4.五年,利率为3.6");
        int cunQi = sc.nextInt();
        System.out.println("请存钱:");
        int money = sc.nextInt();
        double benXiTotal = 0;
        if (cunQi==1){
            benXiTotal = money+money*2.25;
        }else if (cunQi==2){
            benXiTotal = money+money*2.7;
        }else if (cunQi==3){
            benXiTotal = money+money*3.25;
        }else if (cunQi==4){
            benXiTotal = money+money*3.6;
        }else {
            System.out.println("您输入内容有误");
        }
        System.out.println("本息合计为:"+benXiTotal);
    }
}

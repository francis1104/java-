package com.ithema.hf.homework;

import java.util.Scanner;

/*3、统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)*/
public class Day08JiChu03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String s = sc.nextLine();//A:键盘录入一个字符串数据
        int uperLeter = 0;//B:定义三个统计变量，初始化值都是0
        int lowerLeter = 0;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {//C:遍历字符串，得到每一个字符
            /*D:拿字符进行判断
​                    假如ch是一个字符。
​                    大写：ch>='A' && ch<='Z'
​                   小写：ch>='a' && ch<='z'
​                   数字：ch>='0' && ch<='9'*/
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                uperLeter++;
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                lowerLeter++;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num++;
            }
        }
        System.out.println("uperLeter = " + uperLeter);//E:输出结果
        System.out.println("lowerLeter = " + lowerLeter);
        System.out.println("num = " + num);
    }
}

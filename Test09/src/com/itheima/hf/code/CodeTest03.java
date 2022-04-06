package com.itheima.hf.code;

import java.util.Scanner;

/*模拟注册用户，按照以下要求实现相关功能：
    a. 提示用户在控制台输入手机号码，并接收。
    b. 判断该手机号码是否是11位，是否都是数字，其余可以不做判断，如果不符合任意一项，则提示用户“注册用户失败”。
c. 将手机号的后四位获取出来输出到控制台上。*/
public class CodeTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号码:");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
            } else {
                System.out.println("注册用户失败!!");
                return;
            }
        }
        if (chars.length == 11){
            System.out.println(s.substring(7));
        }else {
            System.out.println("注册用户失败!!!");
        }
    }
}

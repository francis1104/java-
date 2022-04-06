package com.itheima.hf.test3_6;

import java.util.Scanner;

/*让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台*/
public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入3个整数:");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        int temp = (i1 < i2) ? i1 : i2;
        int min = (temp < i3) ? temp : i3;
        System.out.println("min = " + min);
    }
}

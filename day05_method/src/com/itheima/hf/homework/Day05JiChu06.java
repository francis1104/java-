package com.itheima.hf.homework;

import java.util.Scanner;

/*	1.键盘录入一个整数(正数或者负数都可以,但是符号位不算有效的数字位)
	2.定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
	3.在main方法中打印该数字是几位数
	4.演示格式如下:
		(1)演示一:
			请输入一个整数:1234
			控制台输出:1234是4位数字
		(2)演示二:
			请输入一个整数:-34567
			控制台输出:-34567是5位数字*/
public class Day05JiChu06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INput a integer");
        int num = testFind(sc.nextInt());
        System.out.println("num = " + num);
    }

    public static int testFind(int i) {
        int count = 1;
        while (i/10!=0){
            i/=10;
            count++;
            System.out.println("i = " + i);
        }
        return count;
    }
}

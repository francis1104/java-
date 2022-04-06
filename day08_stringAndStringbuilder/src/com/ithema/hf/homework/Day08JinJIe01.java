package com.ithema.hf.homework;

import java.util.Scanner;

/*三	需求说明：请用户输入一个“QQ号码”，我们来判断这个QQ号码是否正确。
	要求：使用方法来完成判断功能。
	操作步骤描述
	1.建立MainApp类，并包含main()方法。
	2.在MainApp类中定义方法：checkQQ(String qq)
		方法内实现验证。验证规则：
		1)必须是5—12位数字；
		2)首位不能是0；
		3.在main()方法中，请用户输入QQ号码
	4.调用checkQQ (String qq)方法进行判断，并打印判断结果。
*/
public class Day08JinJIe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入QQ号码:");
        String qq = sc.nextLine();
        checkQQ(qq);
    }

    public static void checkQQ(String qq) {
        char[] chars = qq.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {

            }else {
                System.out.println("不是一个QQ号");
                return;
            }
        }
        if (qq.length() >= 5 && qq.length() <= 12) {
            if (qq.startsWith("0")) {
                System.out.println("不是一个QQ号");
            } else {
                System.out.println("是一个QQ号");
            }
        } else {
            System.out.println("不是一个QQ号");
        }
    }
}

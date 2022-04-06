package com.itheima.hf.code;

import java.util.Scanner;

/*提示用户键盘录入一个包含数字和字母的字符串（不做是否包含数字和字母的判断），
遍历字符串分别筛选出数字和字母（如有符号不包含在字母里），按照数字在前字母在后的规则组成一个新的字符串，把组成的新字符串打印在控制台。
*/
public class CodeTest04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个包含数字和字母的字符串:");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        String newString = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                newString+=chars[i];
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                newString+=chars[i];
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                newString+=chars[i];
            }
        }
        System.out.println("newString = " + newString);
    }
}

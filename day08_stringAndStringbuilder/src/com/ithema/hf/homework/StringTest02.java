package com.ithema.hf.homework;

public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "abc";//位置在字符串常量池
        String s2 = new String("abc");//位置在堆内存
        System.out.println(s1==s2);//地址值不同 false
        System.out.println(s1.equals(s2));//内容相同 true
    }
}

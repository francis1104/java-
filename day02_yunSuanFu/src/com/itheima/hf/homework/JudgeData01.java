package com.itheima.hf.homework;

public class JudgeData01 {
    public static void main(String[] args) {
        char c = 'T';
        if(c >= 97 && c <= 122){
            System.out.println("是字母字符");
        }else if(c>=65&&c<=90){
            System.out.println("是字母字符");
        }else{
            System.out.println("不是字母字符");
        }
    }
}

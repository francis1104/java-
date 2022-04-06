package com.ithema.hf.homework;

import java.util.Scanner;

public class StringTest07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String s = sc.nextLine();
        String[] word ={"sb","TMD"};
        for (int i = 0; i < word.length; i++) {
            s = s.replace(word[i], "***");
        }
        System.out.println("s = " + s);
    }
}

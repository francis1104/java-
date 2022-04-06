package com.itheima.hf.homework;

import java.util.Random;
import java.util.Scanner;

/*请使用所学知识，定义一个方法，专门用于生成随机验证码，并在主方法中完成调用，模拟用户验证码输入校验过
程，当用户输入的验证码与系统生成验证码匹配时，给出验证通过提示，否则，重新生成验证码，要求用户重新输
入，再重复以上匹配逻辑。*/
public class StringHomework03 {
    public static void main(String[] args) {
        String y = yanZheng();
        System.out.println("当前验证码:"+y);
        Scanner sc = new Scanner(System.in);
        String nextLine = sc.nextLine();
        y = y.toLowerCase();
        nextLine = nextLine.toLowerCase();
        while (!y.equals(nextLine)){
            y = yanZheng();
            System.out.println("当前验证码:"+y);
            nextLine = sc.nextLine();
            y = y.toLowerCase();
            nextLine = nextLine.toLowerCase();
        }

    }
    public static String yanZheng(){
        Random r = new Random();
        String base = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        char num1 = base.charAt(r.nextInt(62));
        char num2 = base.charAt(r.nextInt(62));
        char num3 = base.charAt(r.nextInt(62));
        char num4 = base.charAt(r.nextInt(62));
        StringBuilder sb = new StringBuilder();
        sb.append(num1).append(num2).append(num3).append(num4);
        return sb.toString();
    }
}

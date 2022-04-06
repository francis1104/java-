package com.itheima.hf.homework;

/*
 **3、报数游戏（1-100），遇到数字中包含 7 和 7 的倍数时需要输出黑马然后跳过当次循环，
 * 不符合条件输出后续的数字。
 */
public class Day03JinJie03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            if (ge == 7 || shi == 7 || i % 7 == 0) {
                System.out.println("黑马");
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

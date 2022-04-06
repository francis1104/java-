package com.itheima.hf.homework;

public class TestDebug {
    public static void main(String[] args) {
        star(7);
    }

    public static int star(int n) {
        int j = 1;
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int k = n - i; k >= 1; k--) {
                System.out.print(" ");
            }
            if (i > n) {
                for (int k = 1; k <= i - n; k++) {
                    System.out.print(" ");
                }
            }
            for (; 2 * i - 1 == j; j += 2) {
                if (i > n) {
                    break;
                }
                //System.out.print(i+" "+j);
                for (int k = j; k >= 1; k--) {
                    if (i > n) {
                        break;
                    }
                    System.out.print("*");
                }
            }
            if (i > n) {
                for (int k = j - 4; k >= 1; j -= 2) {
                    //System.out.print(k+" "+j);
                    for (; k >= 1; k--) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
        return 1;
    }
}

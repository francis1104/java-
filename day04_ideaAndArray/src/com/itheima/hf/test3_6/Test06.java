package com.itheima.hf.test3_6;

/*输出100以内（100）被6整除的数字，每5个换一行*/
public class Test06 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 6 == 0) {
                System.out.print(i + " ");
                if (i % 5 == 0 && i != 0) {
                    System.out.println();
                }
            }
        }
    }
}

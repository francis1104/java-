package com.itheima.hf.homework;

public class Test01 {
    public static void main(String[] args) {

        int[] arr = change();
        System.out.println(arr[0]);

    }

    public static int[] change() {

        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
        }
        int[] arr = {sum};
        return arr;

    }
}

package com.itheima.hf.homework;

/*2、定义功能完成数组的求和。一个功能求偶数和，一个功能求奇数和。一个功能求总和。*/
public class Day05JinJIe02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = testSum(arr);
        System.out.println("sum = " + sum);
        int evenSum = testEvenSum(arr);
        System.out.println("evenSum = " + evenSum);
        int oddSum = testOddSum(arr);
        System.out.println("oddSum = " + oddSum);
    }
    private static int testOddSum(int[] arr) {
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                odd += arr[i];
            }
        }
        return odd;
    }
    private static int testSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static int testEvenSum(int[] arr) {
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even += arr[i];
            }
        }
        return even;
    }
}

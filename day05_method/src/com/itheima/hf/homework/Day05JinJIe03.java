package com.itheima.hf.homework;

/*定义方法，计算出数组中的最大值和最小值。数组:
 int[] arr = {1,43,43,5,4,6,7,7,88,0,9};

 */
public class Day05JinJIe03 {
    public static void main(String[] args) {
        int[] arr = {1, 43, 43, 5, 4, 6, 6, 7, 7, 88, 9, 9, 9, 0, 9};
        int min = testMin(arr);
        System.out.println("min = " + min);
        int max = getmax(arr);
        System.out.println("max = " + max);
    }

    public static int testMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getmax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

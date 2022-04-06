package com.itheima.hf.homework;

import java.util.Random;

/*某公司年会，组织抽奖活动，奖品在奖箱中
（这里奖箱以数组来表示，数组如下）
 int[] arr = { 3, 1, 2, 4, 0, 0, 0, 5 };
数组中1代表1等奖，2代表的2等奖...5代表5等奖，0代表未中奖。
小明随机进行抽取一次，打印对应的奖项，如果抽
取到0则打印 再接再厉
控制台效果,举例如下 ：
*/
public class Day04KuoZhan02 {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4, 0, 0, 0, 5 };
        Random r = new Random();
        int index = r.nextInt(8);
        System.out.println(index);
        switch (index){
            case 0:
                System.out.println("恭喜小明中得"+arr[index]+"等奖");
                break;
            case 1:
                System.out.println("恭喜小明中得"+arr[index]+"等奖");
                break;
            case 2:
                System.out.println("恭喜小明中得"+arr[index]+"等奖");
                break;
            case 3:
                System.out.println("恭喜小明中得"+arr[index]+"等奖");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("再接再厉");
                break;
            case 7:
                System.out.println("恭喜小明中得"+arr[index]+"等奖");
                break;
        }

    }
}

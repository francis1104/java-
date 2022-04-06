package com.ithema.hf.homework.day08jichu04;

import java.util.Scanner;

/***4、现已知工人（Worker）类，属性包含姓名（name）、工龄（year），请编写该类，提供构造方法和get、set**方法。
 * 在测试类中，请查看键盘录入Scanner类的API，创建工人类对象，属性值由键盘录入，打印对象的属性值。输出效果如下：
 ​	请录入工人姓名：
 ​	张三
 ​	请录入工人工龄：
 ​	5
 ​	该工人对象的属性信息如下：
 ​	姓名：张三
 ​	工龄：5*/
public class Day08JiChu04 {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入工人姓名:");
        String name = sc.nextLine();
        w1.setName(name);
        System.out.println("请录入工人工龄:");
        int year = sc.nextInt();
        w1.setYear(year);
        System.out.println("该工人对象的属性信息如下:");
        System.out.println("姓名:"+w1.getName());
        System.out.println("工龄:"+w1.getYear());


    }
}

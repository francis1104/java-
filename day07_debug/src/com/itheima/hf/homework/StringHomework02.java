package com.itheima.hf.homework;

import java.util.Scanner;

/*请设计程序模拟敏感词过滤：使用键盘录入模拟弹幕评论，
将录入的数据进行处理，要求不能出现：sb，tmd，傻蛋
等字眼（这里字母不区分大小写匹配），如果出现了，
则使用**代替，将过滤后的内容打印到控制台*/
public class StringHomework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("相信你的评论一定可以一针见血:");
        String s = sc.nextLine();//接受一个字符串类型的键盘录入
        s = s.toLowerCase();//全部转换为小写方便比较
        String[] sensitiveWords={"sb","tmd","傻蛋","cnmd","ctmd","shadan","sha蛋","傻dan"};//设立敏感词库
        for (int i = 0; i < sensitiveWords.length; i++) {//把敏感词库的每一个词拿出来
            if (s.contains(sensitiveWords[i])){//contains会返回一个布尔类型的值,true为检测到敏感词
                s = s.replace(sensitiveWords[i],"***");//replace这个词==>"***"
            }
        }
        System.out.println("s = " + s);
    }
}

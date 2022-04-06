package com.ithema.hf.homework;

/***2.获取一个字符在一个字符串中出现的次数，**
 ​	比如：String st = "adfdfsfksdfsdjfhsjdfhsfkdfgjdfkgljlds";
 ​	字符‘f’在字符串st中出现的次数
 */
public class Day08JiChu02 {
    public static void main(String[] args) {
        String st = "adfdfsfksdfsdjfhsjdfhsfkdfgjdfkgljlds";
        char[] chars = st.toCharArray();//转换为字符数组
        int count = 0;//计数变量
        for (int i = 0; i < chars.length; i++) {//遍历数组
            if (chars[i] == 'f') {//和f相等则计数
                count++;
            }
        }
        System.out.println("count = " + count);//打印计数
    }
}

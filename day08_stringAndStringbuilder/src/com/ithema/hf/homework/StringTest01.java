package com.ithema.hf.homework;

/*获取一个字符在一个字符串中出现的次数，比如：String st = "adfdfsfksdfsdjfhsjdfhsfkdfgjdfkgljlds";
字符‘f’在字符串st中出现的次数*/
public class StringTest01 {
    public static void main(String[] args) {
        String st = "adfdfsfksdfsdjfhsjdfhsfkdfgjdfkgljlds";
        char[] c1 = st.toCharArray();
        int count = 0;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] == 'f') {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}

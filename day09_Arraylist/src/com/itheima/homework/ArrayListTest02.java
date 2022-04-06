package com.itheima.homework;

import java.util.ArrayList;

public class ArrayListTest02 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("迪丽热巴");
        strings.add("古力拉扎");
        strings.add("马尔扎哈");
        strings.add(0,"德玛西亚");
        strings.remove(3);
        strings.remove("德玛西亚");
        strings.set(0,"叽里呱啦");
        System.out.println(strings.get(1));
        System.out.println(strings.size());
        System.out.println(strings);
    }
}

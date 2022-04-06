package com.itheima.hf.domain;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        User u1 = new User("张三", 23, "男");
        User u2 = new User("张三1", 2, "男");
        User u3 = new User("张三2", 234, "女");
        User u4 = new User("张三3", 18, "男");
        User u5 = new User("张三4", 17, "男");
        ArrayList<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);
        ArrayList<User> newlist = getUser(list);
        for (int i = 0; i < newlist.size(); i++) {
            System.out.println(newlist.get(i).getName()+"\t"+newlist.get(i).getAge()+"\t"+newlist.get(i).getSex());
        }
    }

    public static ArrayList<User> getUser(ArrayList<User> users) {
        ArrayList<User> newlist = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getAge() >= 18 && "男".equals(users.get(i).getSex())) {
                newlist.add(users.get(i));
            }
        }
        return newlist;
    }
}

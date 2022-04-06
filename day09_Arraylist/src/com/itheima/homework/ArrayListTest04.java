package com.itheima.homework;

import com.itheima.homework.arraylistTest03.Student;

import java.util.ArrayList;

/*
       需求：定义一个方法，方法接收一个集合对象（泛型为Student）
           方法内部将年龄低于18的学生对象找出
           并存入新集合对象，方法返回新集合。
       思路：
           1. 定义方法，方法的形参定义为ArrayList<Student> list
           2. 方法内部定义新集合，准备存储筛选出的学生对象 ArrayList<Student> newList
           3. 遍历原集合，获取每一个学生对象
           4. 通过学生对象调用getAge方法获取年龄，并判断年龄是否低于18
           5. 将年龄低于18的学生对象存入新集合
           6. 返回新集合
           7. main方法中测试该方法
    */
public class ArrayListTest04 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student pdd = new Student("pdd", null, 23, 12345, 100);
        Student stu = new Student("55kai", null, 10, 12345, 100);
        Student stu1 = new Student("dasima", null, 13, 12345, 100);
        Student stu2 = new Student("sunwukong", null, 14, 12345, 100);
        list.add(pdd);
        list.add(stu);
        list.add(stu1);
        list.add(stu2);
        ArrayList<Student> newList = method(list);
        for (int i = 0; i < newList.size(); i++) {
            newList.get(i).say();
        }

    }

    public static ArrayList<Student> method(ArrayList<Student> list) {
        ArrayList<Student> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() < 18) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}

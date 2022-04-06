package com.itheima.homework.arraylistTest03;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest03 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student stu1 = getStudent(1);
        Student stu2 = getStudent(2);
        Student stu3 = getStudent(3);
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        for (int i = 0; i < students.size(); i++) {
            students.get(i).say();
        }

    }

    public static Student getStudent(int count) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        System.out.println("请输入第"+count+"个学生姓名:");
        String name = sc.next();
        System.out.println("请输入第"+count+"个学生年龄:");
        int age = sc.nextInt();
        stu.setName(name);
        stu.setAge(age);
        return stu;
    }
}

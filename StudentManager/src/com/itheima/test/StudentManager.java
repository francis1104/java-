package com.itheima.test;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();

        lo:
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择:");
            String choise = sc.next();
            switch (choise) {
                case "1":
                    addStudent(list);
//                    System.out.println("1 添加学生");
                    break;
                case "2":
                    deleteStudent(list);
//                    System.out.println("2 删除学生");
                    break;
                case "3":
                    updateStudent(list);
//                    System.out.println("3 修改学生");
                    break;
                case "4":
                    queryStudents(list);
//                    System.out.println("4 查看学生");
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    break lo;
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        }
    }

    private static void updateStudent(ArrayList<Student> list) {
        System.out.println("请输入你要修改的学生学号:");
        Scanner sc = new Scanner(System.in);
        String updatesid = sc.next();
        int index = getIndex(list, updatesid);
        if (index == -1) {
            System.out.println("查无信息,请重新输入");
        } else {
            System.out.println("请输入新的学生姓名");
            String name = sc.next();
            System.out.println("请输入新的学生年龄");
            int age = sc.nextInt();
            System.out.println("请输入新的学生生日");
            String birthday = sc.next();
            Student stu = new Student(updatesid, name, age, birthday);
            list.set(index, stu);
            System.out.println("修改成功!");
        }
    }

    private static void deleteStudent(ArrayList<Student> list) {
        System.out.println("请输入你要删除的学生学号:");
        Scanner sc = new Scanner(System.in);
        String deletesid = sc.next();
        int index = getIndex(list, deletesid);
        if (index == -1) {
            System.out.println("查无信息,请重新输入");
        } else {
            list.remove(index);
            System.out.println("删除成功!");
        }
    }

    public static void queryStudents(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("无信息,请添加后再试!");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t生日");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getSid() + "\t\t" + stu.getName() + "\t\t" + stu.getAge() + "\t\t" + stu.getBirthday());
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学号:");
            sid = sc.next();
            int index = getIndex(list, sid);
            if (index == -1) {
                break;
            }else {
            System.out.println("学号已重复请重新输入:");
            }
        }
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        System.out.println("请输入出生日期:");
        String birthday = sc.next();
        Student stu = new Student(sid, name, age, birthday);
        list.add(stu);
        System.out.println("添加成功");


    }

    public static int getIndex(ArrayList<Student> list, String sid) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String id = stu.getSid();
            if (id.equals(sid)) {
                index = i;
            }
        }
        return index;
    }
}

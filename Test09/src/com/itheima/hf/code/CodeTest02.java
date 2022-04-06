package com.itheima.hf.code;

import com.itheima.hf.domain.ClassRoom;

import java.util.ArrayList;

/*1:定义一个ClassRoom对象,包含构造方法,提供get/set方法
班级名称,className(String 类型)	班级类型:classType(String 类型)
班级人数:classCount(int 类型)
2.定义测试类ClassTest,完成以下要求：
定义方法，public static ArrayList<ClassRoom> getClassCount (ArrayList<ClassRoom> classRoom)，获得班
级人数大于50人，并且班级类型是Java的，添加到新的集合中返回。
在main方法中完成以下功能：创建2个ClassRoom对象并赋值，并且将ClassRoom对象添加到ArrayList<ClassRoom>集合中，
调用getClassCount方法并接收，遍历返回的新集合输出新集合中所有元素信息*/
public class CodeTest02 {
    public static void main(String[] args) {
        ClassRoom clr = new ClassRoom("Java53", "Java", 108);
        ClassRoom clr1 = new ClassRoom("Python35", "Python", 18);
        ClassRoom clr2 = new ClassRoom("C++35", "C++", 180);
        ClassRoom clr3 = new ClassRoom("Java35", "Java", 51);
        ArrayList<ClassRoom> classRooms = new ArrayList<>();
        classRooms.add(clr);
        classRooms.add(clr1);
        classRooms.add(clr2);
        classRooms.add(clr3);
        ArrayList<ClassRoom> newclass = getClassCount(classRooms);
        for (int i = 0; i < newclass.size(); i++) {
            System.out.println(newclass.get(i).getClassName());
        }
    }

    public static ArrayList<ClassRoom> getClassCount(ArrayList<ClassRoom> classRoom) {
        ArrayList<ClassRoom> classRooms = new ArrayList<>();
        for (int i = 0; i < classRoom.size(); i++) {
            if (classRoom.get(i).getClassCount() > 50 && "Java".equals(classRoom.get(i).getClassType())) {
                ClassRoom classRoom1 = classRoom.get(i);
                classRooms.add(classRoom1);
            }
        }
        return classRooms;
    }
}

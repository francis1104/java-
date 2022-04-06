package com.itheima.hf.homework;
/*请定义教师类（Teacher），属性包括姓名和工号。。定义教课（teach）方法，输出“工号为xxx的xxx老师正在讲课”。 */
public class TestTeacher{
    public static void main(String[] args) {
        Teacher t = new Teacher("francis",78293);
        t.teach();
    }
}
class Teacher {
    private String name;
    private int id;

    public void teach(){
        System.out.println("工号为"+id+"的"+name+"老师正在讲课");
    }

    public Teacher() {
    }

    public Teacher(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}

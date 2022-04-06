package com.itheima.hf.homework;
/*分析以下需求，并用代码实现
	1.项目经理类Manager
		属性：姓名name
			工号id
			工资salary
			奖金bonus
		行为：
			工作work()
要求:
	1.按照以上要求定义Manager,属性要私有,生成空参、有参构造，setter和getter方法
	2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
	3.调用成员方法,打印格式如下:
工号为123基本工资为15000奖金为6000的项目经理一龙正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....*/
public class Day06JiChu02 {
    public static void main(String[] args) {
        Manager m = new Manager("yilong",123,15000,6000);
        m.work();
        Manager m1 = new Manager();
        m1.setName("francis");
        m1.setId(78293);
        m1.setSalary(150000);
        m1.setBonus(60000);
        System.out.println("工号为"+m1.getId()+"基本工资为"+m1.getSalary()+"奖金为"+m1.getBonus()+"的项目经理"+m1.getName()+"正在努力的做着管理工作,分配任务,检查员工提交上来的代码");
    }
}
class Manager{
    private String name;
    private int id;
    private int salary;
    private int bonus;

    public void work(){
        System.out.println("工号为"+id+"基本工资为"+salary+"奖金为"+bonus+"的项目经理"+name+"正在努力的做着管理工作,分配任务,检查员工提交上来的代码");
    }

    public Manager() {
    }

    public Manager(String name, int id, int salary, int bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/10/18 14:29
 */
public class AbstractEx {
    public static void main(String[] args) {
        Manager manager = new Manager("安柏",0010,20000);
        CommonEmployee commonEmployee = new CommonEmployee("萤",0020,10000);
        manager.work();
        commonEmployee.work();

    }
}

abstract class Employee {
    String name;
    int id;
    double salary;

    //构造器
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //抽象方法
    public abstract void work();
}

//经理类
class Manager extends Employee {
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    double bonus;

    @Override
    public void work() {
        System.out.println("经理 " + name + " 正在做经理工作");
    }
}

//普通员工类
class CommonEmployee extends Employee {
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工 " + name + " 正在做员工工作");
    }
}
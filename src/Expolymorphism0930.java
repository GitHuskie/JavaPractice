/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/30 8:29
 */
/*
现有一个继承结构:要求创建1个Persons对象,1个Student对象,1个Teacher对象,统一放在数组里
调用每个对象say方法(student有study方法,teacher有teach方法)
 */
public class Expolymorphism0930 {
    public static void main(String[] args) {
        Persons[] arr = new Persons[3];
        arr[0] = new Persons("诺艾尔");
        arr[1] = new Student("安柏");
        arr[2] = new Teacher("胡桃");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Student) {
                ((Student) arr[i]).study();
            } else if (arr[i] instanceof Teacher) {
                ((Teacher) arr[i]).teach();
            } else {
                arr[i].say();
            }
        }
    }
}

class Persons {
    public Persons(String name) {
        this.name = name;
    }

    public String name;

    public void say() {
        System.out.println(name + " 正在...");
    }
}

class Student extends Persons {
    public Student(String name) {
        super(name);
    }

    @Override
    public void say() {
        super.say();
    }

    //特有方法
    public void study() {
        System.out.println("学生 " + name + " 正在学习《计算机网络》...");
    }
}


class Teacher extends Persons {
    public Teacher(String name) {
        super(name);
    }

    @Override
    public void say() {
        super.say();
    }

    //特有方法
    public void teach() {
        System.out.println("老师 " + name + " 正在教授《计算机网络》...");
    }
}
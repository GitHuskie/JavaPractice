/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/29 10:30
 */
/*
定义Person类,里面有name,age属性,并提供compaTo比较方法,用于判断是否和另一个人相等
提供测试类TestPerson用于测试,名字年龄完全一样,就返回true否则false
 */
public class ExThis0929 {
    public static void main(String[] args) {
        Doggy doggy = new Doggy("huskie",4);
        Doggy doggy1 = new Doggy("hukie",4);
        System.out.println(doggy.compareTo(doggy1));

    }
}

class Doggy {
    String name;
    int age;

    public Doggy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Doggy dog) {
        return (this.name.equals(dog.name) && this.age == dog.age);
    }
}
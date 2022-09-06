/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/6 18:29
 */
/*
编写一个方法 copyPerson，可以复制一个 Person 对象，返回复制的对象。
克隆对象，注意要求得到新对象和原来的 对象是两个独立的对象，但属性相同。
 */
public class Ex0906copyPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "安柏";
        p1.age = 19;
        Person p2 = p1.copyPerson(p1);
        System.out.println(p2.age + p2.name);
    }
}

class Person {
    String name;
    int age;

    public Person copyPerson(Person p) {
        Person p2 = new Person();
        p2 = p;
        return p2;
    }
}

//class Method {
//
//}
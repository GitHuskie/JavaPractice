/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/19 17:08
 */
public class Ex0919Extends {
    public static void main(String[] args) {
        animal animal = new animal();
        dog dog = new dog();

        animal.print();
        dog.print();
    }
}

class animal {
    String name = "animal";
    int age = 10;

    public void print() {
        System.out.println("name=" + name + " age=" + age);
    }
}

class dog extends animal {
    int age = 4;

    double weight = 15.0;

    public void print() {
        super.print();//利用super调用父类方法
        System.out.println("name=" + name + " age=" + age + " weight=" + weight);
    }
}
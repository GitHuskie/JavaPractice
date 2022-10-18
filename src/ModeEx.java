/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/10/18 16:02
 */
public class ModeEx {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.calculateTime();
        b.calculateTime();

    }
}

//抽象类Template
abstract class Template {
    //抽象方法job
    public abstract void job();

    //实现方法:计算job方法的执行时间
    public void calculateTime() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("job方法执行时间: " + (end - start));
    }
}

class A extends Template{
    //A类方法job:计算方法执行时间
    public void job() {
        int count = 0;
        for (int i = 0; i < 10000000; i++) {
            count += i;
        }
    }
}

class B extends Template{
    //B类方法job:计算方法执行时间
    public void job() {
        int count = 0;
        for (int i = 0; i < 1000_0000; i++) {
            count *= i;
        }
    }
}
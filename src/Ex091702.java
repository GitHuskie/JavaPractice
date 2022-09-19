/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/17 10:18
 */
/*
利用静态成员方法+无参构造器来记数
 */
public class Ex091702 {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        Hero hero2 = new Hero();
        Hero hero3 = new Hero();
        Hero hero4 = new Hero();

        System.out.println("hero1的serialNumber是:" + hero1.getSerialNumber());
        System.out.println("hero2的serialNumber是:" + hero2.getSerialNumber());
        System.out.println("hero2的serialNumber是:" + hero3.getSerialNumber());
        System.out.println("hero2的serialNumber是:" + hero4.getSerialNumber());
    }
}

class Hero {
    private int serialNumber;
    //静态成员变量:用作统计个数
    static int counter;

    //默认无参构造器:里面可以有语句
    public Hero() {
        //创建一个对象就记数一次
        counter++;
        //将记数传给该对象的serialNumber属性
        serialNumber = counter;
    }

    //方法:得到serialNumber属性
    public int getSerialNumber() {
        return serialNumber;
    }
}
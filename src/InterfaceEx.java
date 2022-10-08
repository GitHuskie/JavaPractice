/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/10/8 9:59
 */
public class InterfaceEx {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2, 2);
        System.out.println(circle.area());
        System.out.println(rectangle.area());
    }
}

//接口
interface Shape3D {
    double pi = 3.14;

    public abstract double area();
}

//子类Circle
class Circle implements Shape3D {
    double radius;

    //构造器
    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return pi * radius * radius;
    }
}

//子类Rectangle
class Rectangle implements Shape3D {
    double height;
    double width;

    //构造器
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double area() {
        return 0.5 * width * height;
    }
}

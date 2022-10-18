/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/10/18 13:59
 */
public class FinalEx {
    public static void main(String[] args) {
        Circle2 circle = new Circle2(4);
        System.out.println(circle.getArea());
    }
}

class Circle2 {
    private double radius;
    private final double PI = 3.14;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
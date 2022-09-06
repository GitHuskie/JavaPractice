/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/6 18:58
 */
public class Ex0906Fibonacci {
    public static void main(String[] args) {
        Math2 math2 = new Math2();
        System.out.println(math2.Fibonacci(6));
    }

}

class Math2 {
    public int Fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                //【难点】递归的次序体现在实参上。如此处:实参在递减,就体现了递归的次序。
                return Fibonacci(n - 1) + Fibonacci(n - 2);
            }
        } else {
            System.out.println("输入不对");
            return -1;
        }
    }
}
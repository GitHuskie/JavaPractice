/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/6 14:56
 */
/*
求出1 - 1/2 + 1/3 - 1/4 ... 1/100的和
 */
public class Ex0906 {
    public static void main(String[] args) {
        double res = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                res -= (1.0 / i);
            } else {                //【错误】最开始没加else以为也可以,其实不行。以为if-else是二选一,if就是都可能执行
                res += (1.0 / i);
            }
        }
        System.out.println(res);
    }
}
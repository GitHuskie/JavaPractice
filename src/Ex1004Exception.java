/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/10/4 8:04
 */
public class Ex1004Exception {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int res = 0;

        try {
            System.out.println(res = num1 / num2);
        } catch (Exception e) {
            System.out.println("出现的异常是：" + e.getMessage());
        }
    }
}
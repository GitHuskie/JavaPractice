/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/10/4 8:36
 */
//如果用户输入的不是一个整数,就提示反复输入,直到输入一个整数为止

import java.util.Scanner;

public class Ex1004Ex {
    public static void main(String[] args) {
        int num;
        while (true) {
            System.out.println("请输入一个整数");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            try {
                num = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数");
            }
        }
        System.out.println("你输入的数为：" + num);
    }
}
/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/10/15 16:53
 */

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char answer;

        do {
            System.out.println("还不还钱? y/n");
            answer = scanner.next().charAt(0);
            if (answer != 'y') {
                System.out.println("使出五连鞭");
            } else {
                System.out.println("好的,行吧");
                break;
            }
        } while (answer != 'y');
    }
}
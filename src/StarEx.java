/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/5 19:27
 */
/*
经典的打印金字塔
使用 for 循环完成下面的案例
请编写一个程序，可以接收一个整数,表示层数（totalLevel），打印出金字塔。(Stars.java)
[化繁为简, 先死后活]
 */
public class StarEx {
    public static void main(String[] args) {
        for (int j = 1; j < 8; j++) {//层数:递增
            for (int k = 0; k < 8 - j; k++) {//空格数:总层数-该层数
                System.out.print(" ");
            }
            for (int i = 1; i <= j; i++) {//星数:对于层数
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
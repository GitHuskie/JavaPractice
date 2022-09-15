/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/15 15:39
 */
/*
打印金字塔形的图案
 */
public class ExPrintTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //每行星数=行数
            for (int j = 0; j < i; j++) {
                System.out.print("*" + "  ");
            }System.out.println("");
        }

        System.out.println("=======================");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                //利用continue语句实现
                if (j > i) {
                    continue;
                }
                System.out.print("*" + "  ");
            }
            System.out.println("");
        }
    }
}
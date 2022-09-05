/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/5 16:28
 */
/*
统计 3 个班成绩情况，每个班有 5 名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
统计三个班及格人数，每个班有 5 名同学。
 */

import java.util.Scanner;

public class ex {
    public static void main(String[] args) {
        double totalScore = 0;
        int passNum = 0;
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第1班第" + (i + 1) + "位同学的成绩:");
            double scores = scanner.nextDouble();
            if (scores > 60) {
                passNum++;
            }
            totalScore += scores;
            System.out.println("第1班第" + i + "位同学的成绩为:" + scores);
        }
        double averScore = totalScore / 5;
        System.out.println("第1班平均分为:" + averScore + ",及格人数为:" + passNum);
    }
}
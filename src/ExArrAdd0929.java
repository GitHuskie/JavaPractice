/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/29 8:39
 */
/*
已知有一个升序数组,要求插入一个元素,该数组的顺序依然是升序,比如
 */

import java.util.Scanner;

public class ExArrAdd0929 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 45, 90};
        int index = -1;

        //数组扩容
        int[] newArr = new int[arr.length + 1];

        //比较大小
        System.out.println("请输入您想要插入的元素...");
        Scanner scanner = new Scanner(System.in);
        int insertNum = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (insertNum <= arr[i]) {
                index = i;
                break;
            }
        }
        //最大,放到最后
        if (index == -1) {
            index = arr.length;
        }

        //数组拷贝:如果是需要插入的位置,则j不自增,i自增
        // 【难点】需要想到使用两个变量i和j,且需要变量自增的位置,从而实现插入的功能
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = insertNum;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println("");
    }
}
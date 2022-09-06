/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/6 15:42
 */
/*
有一个数组 {1， 2， 3， 4， 5}
可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素。
当只剩下最后一个元素，提示，不能再缩减。
 */

import java.util.Scanner;

public class Ex0906ArrReduce {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("是否删除一个元素? y/n");
            char choie = scanner.next().charAt(0);
            if (choie == 'y') {
                int[] arr2 = new int[arr1.length - 1];
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = arr1[i];
                }
            }
        } while (true);
    }
}
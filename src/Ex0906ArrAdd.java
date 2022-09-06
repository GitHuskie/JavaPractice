/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/6 15:22
 */

import java.util.Scanner;

public class Ex0906ArrAdd {
    public static void main(String[] args) {
        //初始化数组
        int[] arr = {1, 5, 8, 11, 2};
        do {
            //数组扩容
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;

            //输入新元素
            Scanner scanner = new Scanner(System.in);
            System.out.println("请插入新的元素");
            int add = scanner.nextInt();

            //添加新元素
            newArr[newArr.length - 1] = add;

            //打印新元素
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println("请问还要插入吗? y/n");
            char choice = scanner.next().charAt(0);
            if (choice == 'n') {
                break;}
                else if(choice != 'y'){
                    System.out.println("输入有误,请重新输入");
            }
        } while (true);
    }
}
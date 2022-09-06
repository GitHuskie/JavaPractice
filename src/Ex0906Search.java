/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/6 15:56
 */
/*
有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王
猜数游戏：从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】
要求: 如果找到了，就提示找到，并给出下标值
 */

import java.util.Scanner;

public class Ex0906Search {
    public static void main(String[] args) {
        //初始化数组
        String[] arr = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
        //展示数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        //用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要查找的元素:");
        String findName = scanner.next();

        //查找算法
        int findIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(findName.equals(arr[i])){
                findIndex = i;
            }
        }
        if(findIndex == -1){
            System.out.println("不好意思,数组内不含该元素");
        }else{
            System.out.println("恭喜您找到了！该元素下标为:" + findIndex);
        }
    }
}
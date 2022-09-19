/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/19 15:15
 */
/*
使用arraycopy函数实习数组复制
 */
public class Ex0919Arr {
    public static void main(String[] args) {
        //初始化数组
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {-1, -2, -3, -4, -5, -6};

        System.arraycopy(arr1, 4, arr2, 4, 2);

        //打印数组
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+ " ");
        }
        System.out.println();

        //整型-->字符串
        int i = 1013;
        String str1 = String.valueOf(i);
        System.out.println(str1);

        //字符串-->整型
        String str2 = "1997";
        int j = Integer.parseInt(str2);
        System.out.println(j);

    }
}
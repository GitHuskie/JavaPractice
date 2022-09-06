/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/6 15:48
 */
/*
泡沫排序从小到大：数组 {24,69,80,57,13}
 */
public class Ex0906Bubble {
    public static void main(String[] args) {
        //初始化数组
        int[] arr = {24, 69, 80, 57, 13};
        int temp = 0;

        //外层循环
        for (int j = 0; j < arr.length - 1; j++) {
            //内层循环
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
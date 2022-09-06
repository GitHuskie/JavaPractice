/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/6 17:22
 */
public class Ex0809Method {
    public static void main(String[] args) {
        Math math = new Math();
        int []res = math.countSum(111,222);//【3】用数组接收
        System.out.println("和:" + res[0]);
        System.out.println("差:" + res[1]);
    }
}

class Math {
    public int[] countSum(int n1, int n2) {//【1】形参是数组
        int[] arr = new int[2];
        arr[0] = n1 + n2;
        arr[1] = n1 - n2;
        return arr;//【2】返回数组
    }
}
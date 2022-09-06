/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/6 19:12
 */
/*
猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个
以后每天猴子都吃其中的一半，然后再多吃一个.
当到第 10 天时， 想再吃时（即还没吃），发现只有 1 个桃子了
问题：最初共多少个桃子？
 */
public class Ex0706RecursionPeach {
    public static void main(String[] args) {
        Peach peach = new Peach();
        System.out.println(peach.peachNum(1));
    }
}

class Peach {
    public int peachNum(int day) {
        if (day == 10) {
            return 1;
        } else {
            day = (peachNum(day + 1) + 1) * 2;//【注意】变量名尽量不要用n,而是实意词,如:day
            return day;
        }
    }
}
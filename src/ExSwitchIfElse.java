/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/15 14:52
 */
/*
利用if-else和switch流程控制结构,返回用户每个月份对应的天数
【注意】整个方法代码的书写顺序:
1. 声明需要的变量
2. 确定返回类型
3. 判断输入合法性
4. 书写分支语句
 */

public class ExSwitchIfElse {
    public static void main(String[] args) {
        int month = 10;
        method method = new method();
        System.out.println(method.getDays1(10));
        System.out.println(method.getDays2(7));
    }
}


class method {

    //if-else方法
    public static int getDays1(int month) {
        //【1】声明变量days
        int days;
        //【3】判断输入合法性
        if (month <= 0 || month >= 13) {
            return -1;
            //【4】分支语句
        } else if (month == 2) {
            days = 28;
        } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
            days = 30;
        } else {
            days = 31;
        }
        //【2】返回变量days
        return days;
    }

    //switch方法
    public int getDays2(int month) {
        //【1】声明变量days
        int days;
        //【3】判断输入合法性
        if (month <= 0 || month >= 13) {
            return -1;
        }
        //【4】分支语句
        switch (month) {
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
        }
        //【2】返回变量days
        return days;
    }
}
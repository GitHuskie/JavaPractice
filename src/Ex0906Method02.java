/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/6 17:33
 */
/*
【1】编写类 AA ，有一个方法：判断一个数是奇数 odd 还是偶数, 返回 boolean
【2】根据行、列、字符打印 对应行数和列数的字符
比如：行：4，列：4，字符#,则打印相应的效果
老师建议：一定要自己写一遍，不要嫌太简单
 */
public class Ex0906Method02 {
    public static void main(String[] args) {
        Method method = new Method();

        //调用方法1
        if(method.isOdd(714)){
            System.out.println("是偶数");
        }
        else{
            System.out.println("是奇数");
        }

        //调用方法2
        method.print(6,6,'$');
    }
}

class Method {
    public boolean isOdd(int n1) {
        //利用三元运算符简化代码
        return n1 % 2 == 0 ? true : false;
    }

    public void print(int n1,int n2,char c){
        for (int j = 0; j < n2; j++) {
            for (int i = 0; i < n1; i++) {
                System.out.print('c'+" ");
            }
            System.out.println();
        }
    }
}
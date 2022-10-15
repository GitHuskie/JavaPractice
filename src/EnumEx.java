import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/10/15 11:26
 */

/*
声明Week枚举类,其中包含星期一至星期日的定义,
使用values返回所有的枚举数组,并遍历,输出右图效果
 */
public class EnumEx {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        //遍历,使用增强for循环
        System.out.println("===所有星期的信息如下===");
        for (Week week : weeks
        ) {
            System.out.println(week);
        }
    }
}

enum Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"),
    THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"),
    SUNDAY("星期日");
    private String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
import java.text.DecimalFormat;

/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/9/16 17:10
 */
public class ExException0916 {
    public static void main(String[] args) {
        double n1 = 51.51154444;
        DecimalFormat decimalFormat = new DecimalFormat("0.####");
        System.out.println(decimalFormat.format(n1));

    }
}
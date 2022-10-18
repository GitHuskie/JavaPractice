/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/10/18 13:35
 */
public class Ex1018 {
    public static void main(String[] args) {

    }
}

class Frock{
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock(int serialNumber) {
        serialNumber = getNextNum();
    }

    public static int getNextNum(){
        return currentNum +=100;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}

class TestFrock{
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
    }
}

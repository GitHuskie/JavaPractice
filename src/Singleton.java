/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/10/15 10:47
 */
public class Singleton {
    public static void main(String[] args) {
       Girlfriend gf =  Girlfriend.getInstance();
        System.out.println(gf);
    }
}

class Girlfriend{
    String name;

    private static Girlfriend gf = new Girlfriend("贰妹");

    private Girlfriend(String name) {
        this.name = name;
    }

    public static Girlfriend getInstance(){
        return gf;
    }
}
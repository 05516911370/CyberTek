package day33;
import java.text.DecimalFormat;
public class formatdecimals {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        double a = 22/7.0;

        System.out.println(a);

        System.out.println(df.format(a));

        //6.678543212222;
        System.out.println(df.format(6.678543212222));

    }
}

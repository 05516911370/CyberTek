package day32_MethodOverLoading;
import library.util;


public class methodcalls {
    public static void main(String[] args) {

        String firstname= "elKem";
        String lastname="aBaSIyanik";

        String fullname;

        fullname=util.fullname(firstname,lastname);
        System.out.println(fullname);

        String uniques= util.uniques(fullname.toLowerCase());
        System.out.println(uniques);

        String reversedName =util.reverse(fullname);
        System.out.println(reversedName);

        System.out.println("============================================");


    }
}

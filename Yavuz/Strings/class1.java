package Strings;

import javax.print.DocFlavor;

public class class1 {
    public static void main(String[] args) {

        String name = "Cybertek";
        //             01234567
        //charAt(index);

        char ch1=name.charAt(0); // "C"
        char ch2 = name.charAt(5); //  "t"
        System.out.println(ch1);
        System.out.println(ch2);

        // length()

        String name1 = "Yavuz Selim Abasiyanik";

        int l = name1.length();
        System.out.println(l);


        // last index: length of String - 1;
        int lastindexnumber = name1.length() -1;

        System.out.println(lastindexnumber);
        char lastindex= name1.charAt(1);

        // concat(str) ==>  "Cybertek".concat(" School") ==> "Cybertek School";
        System.out.println(lastindex);

        //toLowerCase();

        String name2= "CYRBERTEK SCHOOL";

        name2.toLowerCase();

        System.out.println(name2.toLowerCase());


        //toUpperCase();

        String name3 = "muhtar";
        name3.toUpperCase();

        // trim();

        String p = "   Cybertek School    ";
        p.trim();           // "Cybertek School";

        System.out.println(p.trim());



        //substring();


        // replcae();

        //indexOf(value)


    }
}

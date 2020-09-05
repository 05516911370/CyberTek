package day17;
/*String methods: charAt, +, length, upper, lower, trim, substring, replace,
        replaceFirst, indexOf, lastIndexOf, equals, equalsIgnoreCase, isEmpty, ends, starts,
        contains
         */

import javax.print.DocFlavor;

public class stringmethods {
    public static void main(String[] args) {
        //charAt
        String str = "Cybertek";
        //            01234567
        System.out.println(str.indexOf("y"));//1

        char chr = str.charAt(1);

        System.out.println(chr);//2

        // +:

        String str2 = "Cybertek";
        str2 = str2+" " + "School";
        System.out.println(str2);//3
        //length:

        String str3 ="Cybertek School";

        int a = str3.length();
        System.out.println(a);//4

        //lastindex: lenght -1

        char ch2 = str3.charAt(a-1); // str3.length() -1
        System.out.println(ch2);//5

        System.out.println("last index:"+(a-1));//6

        // upperCase & lowerCase:

        String str4 = "cybertek";
        str4 = str4.toUpperCase(); // "CYBERTEK"
        System.out.println(str4);//7


        String str5 ="JAVA";
        str5 =str5.toLowerCase();
        System.out.println(str5);//8

        //trim():

        String str6 = "         Cybertek School";
        str6 = str6.trim(); // "Cybertek School"
        System.out.println(str6);//9


        //substring: ENDING INDEX IS EXCLUDED. BEGINING INDEX IS INCLUDED

        String str7 = "I like Java language";
        //             012345678910

        String word = str7.substring(7,10+1);//"Java"

        System.out.println(word);//10

        String word2 = str7.substring(12,str7.length());
        String word3 = str7.substring(12);

        System.out.println(word2);//11
        System.out.println(word3);//12

        String word4 = str7.substring(2,6);

        System.out.println(word4);//13


        //indexOf & lastIndexOf ==> int

        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int i1 = str8.indexOf("W");
        System.out.println(i1);//14

        System.out.println(str8.charAt(i1));//15

        int i2 = str8.indexOf(", W")+2;
        int i3 = str8.indexOf("We");

        System.out.println(i2);//16
        System.out.println(i3);//17

        String str9 = "Java Java Java";

        int i4 = str9.lastIndexOf("J");
        int i5 = str9.indexOf("J");
        int i6 = str9.indexOf(" Java ")+1;
        int i7 = str9.lastIndexOf("Java");

        System.out.println(i4);//18
        System.out.println(i5);//19
        System.out.println(i6);//20
        System.out.println(i7);//21

        //replace & replaceFirst:

        String s1 = "I like Java, Java is a programming language";
        s1 = s1.replace("Java","C#");//"......."
        System.out.println(s1);//22

        String s2 = "I like Java, Java is a aprogramming language";
        s2= s2.replaceFirst("Java", "C#");
        System.out.println(s2);//23

        String s3 = "I like Java, Java is a programming language";
        s3=s3.replace("Java is","C#");
        System.out.println(s3);//24








    }
}

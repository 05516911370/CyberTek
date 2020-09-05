package Strings;

public class practice6 {
    public static void main(String[] args) {

        String name1 = "Cybertek";

        System.out.println(name1.isEmpty());

        String name2= "";
        System.out.println(name2.isEmpty());


        System.out.println("=============================");

        String str1 = "Java";
        String str2 = new String("Java");
        System.out.println(str1+" : "+str2);
        System.out.println(str1==str2);// false
        System.out.println("====");
        System.out.println(str1.equals(str2));//now true
        System.out.println("=====");
        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str3==str4); //false
        System.out.println("====");
        System.out.println(str3.equals(str4));
        System.out.println("=====");
        String str5 = "Java";
        String str6 = "Java";
        System.out.println(str5==str6);//true
        System.out.println("===");
        System.out.println(str5.equals(str6));//true

        System.out.println("====");
        String str7 = "JAVA";
        String str8 = "java";

        System.out.println(str7.equals(str8));//false
        System.out.println("===============");
        System.out.println(str7.equalsIgnoreCase(str8));

        //equalsIgnoreCase();

        System.out.println("======================================");
        //contains();

        String str = "I like to learn java programming language";

        System.out.println(str.contains("phthon"));  //false
        System.out.println(!str.contains("phthon")); //true
        System.out.println(str.contains("Java")); //false

        //startsWith();

        String str9 = "Muhtar";
        System.out.println(str9.startsWith("M"));//true
        System.out.println(str9.startsWith("J"));//false

        System.out.println(str9.startsWith("Mu"));//true

        System.out.println(str9.toLowerCase().contains("mu"));//true
        //                         "muhtar".contains("mu");

        //endsWith();































    }
}

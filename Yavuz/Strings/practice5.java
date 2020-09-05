package Strings;

public class practice5 {
    public static void main(String[] args) {

        //indexOf(value)

        String s5 = "I like to stay in cybertek, we are learning java";
        int r1 =s5.indexOf("r");
        int re2 = s5.indexOf("re");// returns the first char 'r' index
        int r3 = s5.indexOf("rn");
        System.out.println(r1);
        System.out.println(re2);
        System.out.println(r3);


        //lastIndexOf()

        String s6 = "Java is a programming language, and Java is fun";

        int I1 = s6.indexOf("Java is fun");
        int I2 = s6.lastIndexOf("J");
        System.out.println(I1);
        System.out.println(I2);

        String s7 = "Java";

        int r4= s7.indexOf("A");

        System.out.println(r4);

        String s8 = "Java";
        double a = s8.indexOf("a");

        char ch = s8.charAt((int)a);



        //isEmpty()


        String name1 = "Cybertek";

        System.out.println(name1.isEmpty());

        String name2= "";
        System.out.println(name2.isEmpty());


















    }
}

package day34_WrapperClasses;

public class wrapperClass_Methods {
    public static void main(String[] args) {
        String str= "123";
        int a=Integer.parseInt(str);

        System.out.println(str+1);//1231
        System.out.println(a+1);//124

        double d1= Double.parseDouble("7.5");
            // double d2 = 12.5;
        System.out.println(d1-1);

        String s1 = "true";// TRUE or true

        boolean b1 = Boolean.parseBoolean(s1);

        System.out.println(!b1);

        System.out.println("====================================");

        String s2 = "10000.5";
        double d2 = Double.valueOf(s2);//unboxing

        System.out.println(d2);

        String s3 = "FalSe";
        boolean b3 = Boolean.valueOf(s3);// unboxing
        System.out.println(b3);
    }
}

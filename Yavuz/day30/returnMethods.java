package day30;

public class returnMethods {
    public static void main(String[] args) {
        // int num= addition(3,4);
        addition(3,4);// void return lenemez

        int sum= addition2(10,20);
        System.out.println(sum);

        System.out.println(addition2(3,4)*2);
    }
    public static void addition(int a, int b){

        int sum= a+b;
        System.out.println(sum);
    }


    public static int addition2(int a,int b){// int bize return yapmamizi saglar
        int sum = a+b;
        return sum;

    }





















}

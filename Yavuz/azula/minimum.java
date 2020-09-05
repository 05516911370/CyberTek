package azula;

public class minimum {

    public static void main(String[] args) {

        double a = 100;
        double b= 200;
        double c = 300;

        boolean aIsmin = a < b && a < c;
        boolean bIsmin = !aIsmin && b < c;
        boolean cIsmin = !aIsmin && !bIsmin;

        double min = 0;

        if (aIsmin){
            min = a;

        }

        if (bIsmin){

            min= b;

        }

        if (cIsmin){

            min = c;
        }

        System.out.println(min + " is the minimum number");


        System.out.println("===========================");

        int a1 = 100;
        int b1 = 200;
        int c1 = 300;

        boolean e2 = a1<c1 && a1<b1;
        boolean e3 = b1<c1 && !e2;
        boolean e4 = !e2 && !e3;

        String zukô= "";

        if (e2){
            zukô = "merhabalar";
        }else if(e3) {
            zukô = "salar";
        }else if(e3){
            zukô = "oklar";
        }

        System.out.println(zukô);





    }

}

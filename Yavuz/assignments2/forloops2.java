package assignments2;

public class forloops2 {
    public static void main(String[] args) {
        //Task3


        int sum = 0;
         /*
         sum+=2
         sum+=4
          */

        for (int i = 0; i<=100;i++){
            if (i%2==0) {
                sum += i;
            }

        }
        System.out.println(sum);

        System.out.println("=================================");

        //task4

        int sumofodd=0;

        for (int i=1;i<=99;i++){
            if (i%2!=0) {
                sumofodd += i;
            }
        }
        System.out.print(sumofodd);
        System.out.println(" ");
        System.out.println("==========================");
        //task5
        for (char ch ='A';ch<='Z';ch++ ){
            System.out.print(ch+" ");
        }
        System.out.println(" ");
        System.out.println("====================");
        //task_5.1
        for (int i=65;i<=90;i++){
            char ch=(char)i;
            System.out.print(ch+" ");
        }
        System.out.println(" ");
        System.out.println("==================");

        //task6
        for (char ch='a';ch<='z';ch++){
            System.out.print(ch+" ");
        }

        System.out.println();

        for (int i =90; i>=65;i--){
            System.out.print((char)i+" ");
        }



























    }
}

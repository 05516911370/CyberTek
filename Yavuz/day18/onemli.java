package day18;
//write a program that can print all the even numbers between 0~100
//write a program that can print all the odd numbers between 0~100
//write a program that can print a~z
//write a program that can print A~Z
public class onemli {
    public static void main(String[] args) {

        for (int i =1; i<=100; i++){
            if (i%2==0){
                System.out.print(i+" ");

            }

        }
        System.out.print("============ ");

        for(int i=1; i<=100;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.print("============ ");
        char ch = 0;
        for(ch='a'; ch<='z'; ch++) {
            System.out.print(ch);
            System.out.print(" ");
        }
        System.out.print("============ ");
        char ch1 = 0;
        for(ch1=65; ch1<=90; ch1++){
            System.out.print(ch1);
            System.out.print(" ");
        }
        System.out.print("============ ");
        for(int i3=11; i3<=121; i3++ ){
            if (i3%2!=0){
                System.out.print(i3+" ");
            }
        }













    }
}

package day10;

public class MultiBranch {
    public static void main(String[] args) {

        int number = 100;

        if (number > 0){

            System.out.println(number + " is greater than 0");
        }

        if (number < 0){

            System.out.println(number + " is negative");
        }

        if (number == 0){

            System.out.println(number + " is zero");
        }

        System.out.println("======================");

        if (number > 0){
            System.out.println(number + " number is positive");
        }else if (number < 0 ){
            System.out.println(number + " number is negative");
        }else{
            System.out.println(number + " number is 0");
        }
//use this if there is more than 2 options












    }
}

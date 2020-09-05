package day11;
/*
        90 ~ 100 ==> A
        80 ~ 89 ==> B
        70 ~ 79 ==> C
        60 ~ 69 ==> D
        0 ~ 59 ==> F
        other ==> invalid
 */

public class Nestedifstatements {
    public static void main(String[] args) {

        int score = 100;
        String result ="";
        if (score>=0 && score <= 100){ //valid score
            if (score>=90){
                result = "A";
            }else if (score>=80){
                result="B";
            }else if (score>=70){
                result= "C";
            }else if (score>=60){
                result= "D";
            }else if (score<=59){
                result = "F";
            }

        }else{ //invalid score
           result = "isvalid";
        }
        System.out.println(result);
        System.out.println("====================================");

        int score1 = 10;
        String result1 = "";

        System.out.println("========================================");

        int salary = 30000;
        double experience = 5.0;
        String eligible = "true";

        if (salary>=30000 && experience>= 2.0 ){
            eligible = "true";
        }else{
            eligible = "false";
        }
        System.out.println(eligible);

        System.out.println("=====================================");

        int number = 31;
        int number2 = 30;

        String numbers = "";

















    }
}

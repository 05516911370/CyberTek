package day11;

public class modules {
    public static void main(String[] args) {

        int num = 100;;

        String result = "";

        if (num %2 ==0){
            result = "Even";

        }else {
            result="ODD";
        }
        System.out.println(result);
        System.out.println("======================================");

        String result2 = (num%2 ==0) ? "Even" : "Odd";
        System.out.println(result2);

        System.out.println("=========================================");

        int num1 = 10;
        int num2 = 20;
        int max1 = 0;

        if(num1 > num2){
            max1 = num1;
        }else{
            max1 = num2;
        }
        System.out.println(max1);

        int max2 = (num1>num2)? num1  : num2;
        System.out.println(max2);

        System.out.println("=========================");

        int age = 21;
        boolean eligible = false;

        if (age >=21){
            eligible = true;
        }else {
            eligible = false;
        }
        System.out.println(eligible);


        boolean eligible2 = (age>=21)? true : false;
        System.out.println(eligible2);

        System.out.println("===============================");

        int age2= 19;
        String citizen = "US";
        String nameFirst= "Yavuz";
        String nameLast = "Abasiyanik";

        boolean eligible4 = (age2>=18&& citizen=="US")? true : false;
        if(eligible4){
            System.out.println(nameFirst+" "+ nameLast +" can vote for Trump:"+" "+ eligible4);
        }





    }
}

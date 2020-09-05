package day35_ArrayList;

public class SumOfDigits {
    public static void main(String[] args) {
        String str = "a1b2c3456";
        int sum = 0;

        for (int i =0;i<=str.length()-1;i++){
            char each = str.charAt(i);
                    // 0   ~     9
            if (each>=48&&each<=57){// if the char is between 48~57 , then it's digit
                sum+=Integer.parseInt(""+each);// convert the char to Integer then add it to the sum
                //sum+= each-48 : its same
            }
        }

        System.out.println(sum);





    }
}

package day25;

public class longestString {
    public static void main(String[] args) {

        String[] arr = {"Anam","Nickolas","Amir","Nurmamet"};

        int maxLenght = arr[0].length();

        for (String each:arr){

            if (each.length()>maxLenght){
                maxLenght=each.length();
            }
        }

        for (String each:arr){
            if (each.length() ==maxLenght){
                System.out.println(each);
            }
        }





    }
}

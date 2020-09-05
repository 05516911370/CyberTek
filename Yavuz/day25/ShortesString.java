package day25;

public class ShortesString {
    public static void main(String[] args) {


        String[] str = {"Anam","Nickolas","Amir","Nurmamet"};
        int minLength = str[0].length();

        for (int i =0; i<=str.length-1;i++){
            int l=str[i].length();

            if (l<minLength){
                minLength=l;
            }
        }
        System.out.println(minLength);
        for (int i =0; i<=str.length-1;i++){
            if(str[i].length()==minLength){
                System.out.println(str[i]);
            }
        }



        }
}

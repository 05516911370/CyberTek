package day23;

public class tekrar {
    public static void main(String[] args) {

        int [] arr={1,1,2,3,3};
        for (int i=0; i<=arr.length-1;i++){
            int num1 = arr[i];
            int count=0;

            for (int j =0; i <=arr.length-1;i++){
                int each = arr[j];
                if (each ==num1){
                    count++;
                }
            }
            if (count==1){
                System.out.println(num1);
            }


        }






















    }
}

package day22;

public class maxmin {
    public static void main(String[] args) {
        int[] arr = {5,5,4,3,4,1};

        int max = arr[0]; // 5

        for (int i =1; i<=arr.length-1; i++){
            if(arr[i]>max){
                max=arr[i];


            }
        }
        System.out.println(max);







    }
}

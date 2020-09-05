package day33;
import library.util;
import java.util.Arrays;

public class sortdescending {
    public static void main(String[] args) {

        int arr[]= {1,4,3,2,5};
        System.out.println(Arrays.toString(sortDesc(arr)));
        System.out.println("================================");

        double[] scores = {100,75,85,95,65,55};
        scores = sortDesc(scores);
        System.out.println(Arrays.toString(sortDesc(scores)));

        String[] arr2={"avuz","ikimiz","nasilsin"};
        System.out.println(Arrays.toString(sortDesc(arr2)));

    }



    public static int[] sortDesc(int[] arr){
        Arrays.sort(arr);

        int[] arr2 = new int[arr.length];
        int a=0;
        for (int i=arr.length-1;i>=0;i--){
            arr2[a]=arr[i];
            a++;
        }
        return arr2;
        }


        public static double[] sortDesc(double[] arr){
            Arrays.sort(arr);

            double[] arr2 = new double[arr.length];
            int a=0;
            for (int i=arr.length-1;i>=0;i--){
                arr2[a]=arr[i];
                a++;
            }
            return arr2;
        }

    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr);

        String[] arr2 = new String[arr.length];
        int a=0;
        for (int i=arr.length-1;i>=0;i--){
            arr2[a]=arr[i];
            a++;
        }
        return arr2;
    }

    }




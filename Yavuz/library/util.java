package library;

import java.util.Arrays;
import java.util.Scanner;

public class util {
   // import library.util;



// strings
    public static String removeDup(String str){
        String nonDup="";


        for (String each: str.split("")){
            if (!nonDup.contains(each)){
                nonDup+=each;
            }
        }
        return nonDup;
    }
    // removes the dublicates and returns the value string
    public static String reverse(String str){
        String a="";
        for (int i=str.length()-1;i>=0;i--){
            a+=str.charAt(i);
        }
        return a;
    }
    //reverse the string and return he value
    public static int frequency(String str, char ch){
        int count=0;
        for (char each: str.toCharArray()){
            if (each==ch){
                count++;
            }
        }
        return count;
    }
    // finds the frequency of char from stirng str and returns it as int
    public static String uniques(String str){
        String uniques="";
        for (char each:str.toCharArray()){
            int count= frequency(str,each);// frequency of every character
            if (count==1){
                uniques+=each;
            }
        }
        return uniques;
    }
    // returns the uniques from the strin
    public static String frequencyOfChars(String str){
        String expectedResult="";

        String nonDup =   util.removeDup(str);

        for (char each:nonDup.toCharArray()){
            int count =util.frequency(str,each);
            expectedResult+=""+each+count;
        }
        return expectedResult;

    }
    // returns the frequency of every single characters from a strin
    public static String fullname(String first, String second){
        Scanner scan=new Scanner(System.in);

        first=first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        second=second.substring(0,1).toUpperCase()+second.substring(1).toLowerCase();

        String fulname= first+" "+second;
        return fulname;

    }
    // formats the fullname


  //arrays
    public static int[] combine2Arrays (int[] arr1, int[]arr2){
        int[] arr3 = new int [arr1.length+arr2.length];

        int i =0;
        for (int each:arr1){
            arr3[i]=each;
            i++;
        }
        for (int each:arr2){
            arr3[i]= each;
            i++;
        }
        return arr3;
    }
    //combines two array
    public static int maxNum(int[] arr){
        int maxnum=0;

        Arrays.sort(arr);

        maxnum=arr[arr.length-1];
        return maxnum;


    }
    //maxnum
    public static Integer maxNum(Integer[] arr){
        Integer maxnum=0;

        Arrays.sort(arr);

        maxnum=arr[arr.length-1];
        return maxnum;


    }
    //maxnum
    public static double maxNum(double[] arr){
        double maxnum=0;

        Arrays.sort(arr);

        maxnum=arr[arr.length-1];
        return maxnum;


    }
    //maxnum
    public static Double maxNum(Double[] arr){
        Double maxnum=0.0;

        Arrays.sort(arr);

        maxnum=arr[arr.length-1];
        return maxnum;


    }
    //maxnum
    public static int minNum(int[]arr){
        int min=0;
        Arrays.sort(arr);
        min=arr[0];
        return min;
    }
    //minnum
    public static Integer minNum(Integer[]arr){
        Integer min=0;
        Arrays.sort(arr);
        min=arr[0];
        return min;
    }
    //minnum
    public static double minNum(double[]arr){
        double min=0;
        Arrays.sort(arr);
        min=arr[0];
        return min;
    }
    //minnum
    public static Double minNum(Double[]arr){
        Double min=0.0;
        Arrays.sort(arr);
        min=arr[0];
        return min;
    }
    //minnum

    public static int[] addElement(int[]arr, int num){
        int arr2[]= new int[arr.length+1];
        arr2[arr2.length-1]=num;

        int i=0;

        for (int each: arr){
            arr2[i]=each;


            i++;
        }
        return arr2;

    }
    // inserts the element to the array

    /*
    double, Double, Integer, char, Character, String array
     */

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



    public static Integer[] sortDesc(Integer[] arr){
        Arrays.sort(arr);

        Integer[] arr2 = new Integer[arr.length];
        int a=0;
        for (int i=arr.length-1;i>=0;i--){
            arr2[a]=arr[i];
            a++;
        }
        return arr2;
    }
     //sorts Integre aray in descending order
    public static Double[] sortDesc(Double[] arr){
        Arrays.sort(arr);

        Double[] arr2 = new Double[arr.length];
        int a=0;
        for (int i=arr.length-1;i>=0;i--){
            arr2[a]=arr[i];
            a++;
        }
        return arr2;
    }
    //sorts Double aray in descending order
    public static Character[] sortDesc(Character[] arr){
        Arrays.sort(arr);

        Character[] arr2 = new Character[arr.length];
        int a=0;
        for (int i=arr.length-1;i>=0;i--){
            arr2[a]=arr[i];
            a++;
        }
        return arr2;
    }
    //sorts Character aray in descending order


    public static String[] combine2Arrays (String[] arr1, String[]arr2){
        String[] arr3 = new String [arr1.length+arr2.length];

        int i =0;
        for (String each:arr1){
            arr3[i]=each;
            i++;
        }
        for (String each:arr2){
            arr3[i]= each;
            i++;
        }
        return arr3;
    }
    //combines two array and returns it
    public static double[] combine2Arrays (double[] arr1, double[]arr2){
        double[] arr3 = new double [arr1.length+arr2.length];

        int i =0;
        for (double each:arr1){
            arr3[i]=each;
            i++;
        }
        for (double each:arr2){
            arr3[i]= each;
            i++;
        }
        return arr3;
    }
    //combines two array and returns it
    public static char[] combine2Arrays (char[] arr1, char[]arr2){
        char[] arr3 = new char [arr1.length+arr2.length];

        int i =0;
        for (char each:arr1){
            arr3[i]=each;
            i++;
        }
        for (char each:arr2){
            arr3[i]= each;
            i++;
        }
        return arr3;
    }
    //combines two array and returns it
    public static Integer[] combine2Arrays (Integer[] arr1, Integer[]arr2){
        Integer[] arr3 = new Integer [arr1.length+arr2.length];

        int i =0;
        for (Integer each:arr1){
            arr3[i]=each;
            i++;
        }
        for (Integer each:arr2){
            arr3[i]= each;
            i++;
        }
        return arr3;
    }
    //combines two array and returns it
    public static Double[] combine2Arrays (Double[] arr1, Double[]arr2){
        Double[] arr3 = new Double [arr1.length+arr2.length];

        int i =0;
        for (Double each:arr1){
            arr3[i]=each;
            i++;
        }
        for (Double each:arr2){
            arr3[i]= each;
            i++;
        }
        return arr3;
    }
    //combines two array and returns it
    public static Character[] combine2Arrays (Character[] arr1, Character[]arr2){
        Character[] arr3 = new Character [arr1.length+arr2.length];

        int i =0;
        for (Character each:arr1){
            arr3[i]=each;
            i++;
        }
        for (Character each:arr2){
            arr3[i]= each;
            i++;
        }
        return arr3;
    }
    //combines two array and returns it










}

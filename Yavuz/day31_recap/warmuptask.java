package day31_recap;

public class warmuptask {
    public static void main(String[] args) {

        String str="aabccd";
        String uniques="";
        for (char each:str.toCharArray()){
            int count= frequency(str,each);
            if (count==1){
                uniques+=each;
            }
        }
        System.out.println(uniques);
        System.out.println("===========================");

        String str2="pppoiiiirmmtta";
        String uniques2=uniques(str2);
        System.out.println(uniques2);
    }



    public static int frequency(String str, char ch){
      int count=0;
      for (char each: str.toCharArray()){
          if (each==ch){
              count++;
          }
      }
        return count;
    }
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
    public static void frequency(String str1, String a){
        int count=0;

        for (int i=0;i<=str1.length()-a.length();i++){
            if (str1.substring(i,i+a.length()).equalsIgnoreCase(a)){
                count++;

            }

        }
        System.out.println(count);

    }







}

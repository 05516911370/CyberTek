package day31_recap;
import library.util;
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="AABBBCCC";

        String expectedResult="";

        String nonDup =   util.removeDup(str);



   /*
        for (int i=0;i<=util.removeDup(str).length()-1;i++){
            char ch= nonDup.charAt(i); //A
            int count =util.frequency(str,ch);
            expectedResult+=""+ch+count;
        }
        System.out.println(expectedResult);
*/
        for (char each:nonDup.toCharArray()){
            int count =util.frequency(str,each);
            expectedResult+=""+each+count;
        }






        System.out.println(frequencyOfChars("aaaaaaajjaskjdakjlqkwl"));

    }

    public static String frequencyOfChars(String str){
        String expectedResult="";

        String nonDup =   util.removeDup(str);

        for (char each:nonDup.toCharArray()){
            int count =util.frequency(str,each);
            expectedResult+=""+each+count;
        }
        return expectedResult;

    }
}

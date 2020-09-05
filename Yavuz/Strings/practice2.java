package Strings;

public class practice2 {
    public static void main(String[] args) {


    String sentence = "Java is fun";

   /* char a = sentence.charAt(0);
    char b = sentence.charAt(1);
    char c = sentence.charAt(2);
    char d = sentence.charAt(3);
    */

        String word = sentence.substring(0,3+1);
        System.out.println(word);

        String word2 = sentence.substring(8,10+1);
        System.out.println(word2);


        System.out.println("============================");



        String sentence2 = "I like Movies and TV Series";




        String word3 = sentence2.substring(7,13);
        System.out.println(word3);

        System.out.println("===========================");

        String firstname = "mUHTAR";
        String firstChareacter = firstname.substring(0,1);
        String rest = firstname.substring(1, firstname.length());//firstname.length()==> last index +1

        firstname = firstChareacter.toUpperCase()+ rest.toLowerCase();




        System.out.println(firstChareacter);
        System.out.println(rest);
        System.out.println(firstname);
    }
}

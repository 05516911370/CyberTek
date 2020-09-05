package day25;

public class firstThreeChars {
    public static void main(String[] args) {

        String[] words = {"Apple","Banana","Straberry","Java","Python"};

        for (int i = 0;i<=words.length-1;i++) {
            System.out.println(words[i].substring(0, 3));
        }
        System.out.println("=====================================");

        for (String each:words){
            System.out.println(each.substring(0,3));
        }



















    }
}

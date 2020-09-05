package azula;

import java.util.*;

public class DENEME {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int word[] = {0,100,4,0,9};

        for (int each:word){
        for (int a=0;a<1;a++){
            System.out.println(Arrays.toString(word));
        }
        for (int each2:word) {
            for (int i = 1; i < 2; i++) {
                if (word[0] == 0) {
                    word[1] = word[1] / 2;
                }
                if (word[word.length - 1] == 0) {
                    word[word.length - 2] = word[word.length - 2] / 2;
                }
                if (word[i] == 0) {
                    word[i + 1] = word[i + 1] / 2;
                }
                if (word[i] == 0) {
                    word[i - 1] = word[i - 1] / 2;
                }
                System.out.println(Arrays.toString(word));
                if (word[0] == 0 && word[1] == 0 && word[2] == 0 && word[3] == 0 && word[4] == 0) {
                    System.exit(0);
                }
            }
        }
        }






    }

}
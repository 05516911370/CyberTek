package day23;

public class UniqueWords {
    public static void main(String[] args) {

        String[]words = {"C#","C#","Java","Python","Python","C++"};

        String s = words[0];
        int count = 0;
        for (int j =0; j <=words.length-1;j++) {
            for (int i = 0; i <= words.length - 1; i++) {
                String each = words[i];
                if (s.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(s + " ");
            }
        }





























    }
}

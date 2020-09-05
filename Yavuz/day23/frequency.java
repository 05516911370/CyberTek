package day23;

public class frequency {
    public static void main(String[] args) {


        String str = "aabcc";
        String expectedResult = "";

        for (int j=0;j<=str.length()-1;j++) {
            char ch1 = str.charAt(0);//"a"
            int count1 = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                char each = str.charAt(i);// a a b c c
                if (ch1 == each) {
                    count1 += 1;
                }
            }
            if (count1 == 1) {
                expectedResult += ch1;
            }


        }
        System.out.println(expectedResult);





    }
}

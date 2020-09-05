package day20While.loops;

public class BranchingStatements {
    public static void main(String[] args) {

        char ch = 'A';
        while(ch<='E'){
            if (ch=='C'){
                ch++;
                //continue;
                //break;
                System.exit(0);
            }
            System.out.println(ch);
            ch++;
        }
        System.out.println("ana");

        /*...*/
        System.out.println("===============================");

        boolean a = true;
        while (a) {

            System.out.println("Test started");
            break;
        }
        System.out.println("Completed");

    }
}

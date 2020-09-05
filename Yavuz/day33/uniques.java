package day33;

public class uniques {
    public static void main(String[] args) {
        int[] arr= {2,2,1,3};

        for (int i=0;i<=arr.length-1;i++){
            int unique=0;
            for (int j=0;j<=arr.length-1;j++){
                if (arr[i]==arr[j]){
                    unique++;
                }

            }
            if (unique==1){
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println("==========================================");
        int[] n1= {10,20,20,30,40,40,50,60,60,70,80,90,100,100,110};
        uniqueElements(n1);

        System.out.println("============================");
        double[] n2= {10,20,20,40,50,50};
        uniqueElements(n2);

        System.out.println("============================");
        String []n3 = {"A","A","B","C","D","D"};
        uniqueElements(n3);

        System.out.println("============================");
        char[] ch = {'A','B','B','C'};
        uniqueElements(ch);
    }

    public static void uniqueElements(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int unique = 0;
            for (int j = 0; j <= arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    unique++;
                }
            }
            if (unique == 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static void uniqueElements(char[] arr) {
        for (char i:arr) {
            int unique = 0;
            for (char j:arr) {
                if (i == j) {
                    unique++;
                }
            }
            if (unique == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void uniqueElements(double[] arr) {
        for (double a:arr) {
            int unique = 0;
            for (double b:arr) {
                if (a == b) {
                    unique++;
                }
            }
            if (unique == 1) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }
    public static void uniqueElements(String[] arr) {
        for (String a:arr) {
            int unique = 0;
            for (String b:arr) {
                if (a .equalsIgnoreCase(b) ) {
                    unique++;
                }
            }
            if (unique == 1) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }
}

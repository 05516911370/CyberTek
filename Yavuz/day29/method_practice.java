package day29;

public class method_practice {
    public static void main(String[] args) {
        even();

        odd();




    }
    public static void even(){
        for (int i=1; i<=100;i++){
            if (i%2!=0){
                continue;
            }
            System.out.print(i+" ");

        }
        System.out.println();    }


    public static void odd(){
        for (int i=1; i<=100;i++){
            if (i%2==0){
                continue;
            }
            System.out.print(i+" ");

        }
        System.out.println();
    }
}

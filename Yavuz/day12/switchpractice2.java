package day12;
/*
    28 days:2
    30 days:4,6,9,11
    31 days: 1,3,5,7,9,10,12
    invalid:month > 12 ||<1
 */

public class switchpractice2 {
    public static void main(String[] args) {


        int month =10;

        switch (month){

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 days");
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("invalid month");






        }


















    }
}

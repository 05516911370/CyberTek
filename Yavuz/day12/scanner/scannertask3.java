package day12.scanner;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class scannertask3 {
    public static void main(String[] args) {
        Scanner melo = new Scanner(System.in);

        System.out.println("Enter you year here");
        int vehicleyear = melo.nextInt();

        if(vehicleyear<2000){
            System.out.println("Your vehicle is trash");
        }else{
            System.out.println("your vehicle is very good");
        }









    }
}

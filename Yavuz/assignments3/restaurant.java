package assignments3;
/*Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:

Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75*/

import java.util.Scanner;

public class restaurant {
    public static void main(String[] args) {
        Scanner zuko = new Scanner(System.in);


        System.out.println("Split: ");
        String split = zuko.next();
        if (split.equals("yes")){
            System.out.println("number of people: ");
            int numpeep = zuko.nextInt();

            System.out.println("total to pay: ");
            double totalpay = zuko.nextDouble();

            System.out.println("total tip: ");
            double totaltip = zuko.nextDouble();

            double perperson = totalpay/numpeep;
            double totatipPerson = totaltip/numpeep;

            System.out.println("total per person: "+perperson);
            System.out.println("total tip per peron: "+ totatipPerson);

        }else if(split.equals("no")){
            System.out.println("number of people: ");
            int numpeep = zuko.nextInt();

            System.out.println("total to pay: ");
            double totalpay = zuko.nextDouble();

            System.out.println("total tip: ");
            double totaltip = zuko.nextDouble();

            double perperson = totalpay;
            double totatipPerson = totaltip;

            System.out.println("total per person: "+perperson);
            System.out.println("total tip per peron: "+ totatipPerson);
        }



















    }
}

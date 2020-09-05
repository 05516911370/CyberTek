package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {

        ArrayList<Integer> oddlist = new ArrayList<>();
        ArrayList<Integer> evenlist = new ArrayList<>();

        for (int i =0;i<=100;i++){
            if (i%2!=0) {
                oddlist.add(i);
            }else{
                evenlist.add(i);
            }
        }
        System.out.println(oddlist);
        System.out.println();
        System.out.println(evenlist);
        System.out.println("===============================");

        ArrayList<String> groceryList = new ArrayList<>();
            groceryList.add("Milk");
            groceryList.add("Apple");
            groceryList.add("Eggs");
            groceryList.add("Mango");
            groceryList.add("Ice Cream");

            for (int i =groceryList.size()-1;i>=0;i--){
                System.out.print(groceryList.get(i)+"   ");
            }
        System.out.println();

            for (String each:groceryList){
                System.out.print(each+"   ");
            }






    }
}

package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {
        ArrayList<String> earlybirdList = new ArrayList<>();
            earlybirdList.add("Ibrahim");
            earlybirdList.add("Virginia");
            earlybirdList.add("Ziiadin");
            earlybirdList.add("Ergan");
            earlybirdList.add("Aalia");


            earlybirdList.set(2,"Aslan");
            earlybirdList.set(0,"lan");

        System.out.println(earlybirdList);

        earlybirdList.clear();

        System.out.println(earlybirdList);

        System.out.println("==================================");

        ArrayList<Integer> list = new ArrayList<>();

            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            list.remove(2);
            // list.remove(4);
            list.remove(3);

        System.out.println(list);

        System.out.println("=======================================");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        Integer a=1; //[2,3,4,5]
        //inr a=1; [1,3,4,5]

        list2.remove(a);

        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
            list3.add("Hamit");
            list3.add("Lilia");
            list3.add("Bulnet");
            list3.add("Viorel");
            list3.add("Musa");

        boolean r=list3.remove("bulnet");//false
        boolean r1 = list3.remove("Musa");//true

        System.out.println(list3);
        System.out.println(r);
        System.out.println(r1);




    }

}

package day28;

import java.util.*;

public class multiDimensionalArrayPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] group33= {"Davut","Dilare","Nurmamet","Nurbiye","Pavlo","Julaiti","Virginia","zain"};
        String[] group22={"Aiperi","Aalia","Rumiya","Vioral","Samir"};
        String[] group2={"Ali","Anton","Elig","Filip","guljannat"};
        String[] group21={"Yavuz","Mehmet","Selim","Abasiyanik"};
        String[] group17={"Elviram","Zeliha","Paban","Asylkan","Dilyar","Rodney"};

        String[][] batch20 = {group33,group22,group2,group21,group17};

        for (int i=0;i<=batch20.length-1;i++){
            String[] eachgroup = batch20[i];
            for (int j=0;j<=eachgroup.length-1;j++){
                String eachstudent = eachgroup[j];
              if (eachstudent.toLowerCase().contains("m")) {
                  System.out.print(eachstudent + "     ");
              }
            }
            System.out.println();
        }





    }
}

package day34_WrapperClasses;
import library.util;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {

        Integer arr1[] = {1,2,3,4};
        Integer arr2[] = {5,6,7,8};
        Integer []arr3 = util.combine2Arrays(arr1,arr2);

        System.out.println(Arrays.toString(arr3));

        Integer max = util.maxNum(arr3);
        System.out.println(max);

        int min = util.minNum(arr3);
        System.out.println(min);

        Character[] ch = {'A','B','C','B','B','D'};
        ch = util.sortDesc(ch);

        System.out.println(Arrays.toString(ch));

    }
}

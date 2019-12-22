package kata.kata02;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

    public static void main(String[] args) {


        int[] numbers = new int[]{2, 50, 234, 23445, 56, 4, 87, -90, 78, 60, 11, 0, 1};
        int searchedNo = 11;
        int size = numbers.length;



        //pierwsza na uporzadkowanej

        Arrays.sort(numbers);

        System.out.println("Sorted arrays is as follows: " + Arrays.toString(numbers));
        int position = Arrays.binarySearch(numbers, searchedNo);
        System.out.println("Searched no is binary found at position no " + position);

        // druga na uporzadkowanej

        if (binarySearch(numbers, 11)) {
            System.out.println("Found no 11 at position no " + position);
        }


    }
//tu mi jeszcze ucieklo, czemu ta cholera musi byc statyczna i czemu mi podkresla elelemtny

    private static boolean binarySearch(int[] array, int search) {
        int firstEl = 0;
        int lastEl = array.length - 1;
        int middle = (firstEl + lastEl) / 2;
        while (firstEl <= lastEl) {
            if (array[middle] < search) {
                firstEl = middle + 1;
            } else if (array[middle] == search) {
                return true;
            } else {
                lastEl = middle - 1;
            }
            middle = (firstEl + lastEl) / 2;
        }
        return false;
    }


}





package kata.kata02;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchOnArrayList {


        public static void main(String[] args) {


            ArrayList<Integer> numbersPool = new ArrayList();
            numbersPool.add(2);
            numbersPool.add(50);
            numbersPool.add(234);
            numbersPool.add(224);
            numbersPool.add(56);
            numbersPool.add(4);
            numbersPool.add(87);
            numbersPool.add(-90);
            numbersPool.add(78);
            numbersPool.add(60);
            numbersPool.add(11);
            numbersPool.add(0);

            System.out.println(numbersPool);

            //Collections.sort(numbersPool);

            System.out.println("Sorted list is as follows:  " + numbersPool);

            int key = 56;
            int searchedIndex =  Collections.binarySearch(numbersPool, key);

            System.out.println("Searched item is "+ key + "," + " searched index is as follows: " + searchedIndex);
        }


}

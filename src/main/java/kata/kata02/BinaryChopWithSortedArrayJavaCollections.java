package kata.kata02;

import java.util.Collections;
import java.util.List;

public class BinaryChopWithSortedArrayJavaCollections {

    public int runBinarySearchUsingJavaCollections(List<Integer> sortedList, Integer value) {

        int index = Collections.binarySearch(sortedList, value);
        return index;
    }

}

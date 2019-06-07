package chopper;

import java.util.Collections;
import java.util.List;

public class WithJavaCollection {

    public int runBinarySearchUsingJavaCollections(List<Integer> sortedList, Integer key) {
        int index = Collections.binarySearch(sortedList, key);
        return index;
    }
}

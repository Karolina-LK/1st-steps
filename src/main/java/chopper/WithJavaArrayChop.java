package chopper;

import java.util.Arrays;
import java.util.List;

public class WithJavaArrayChop implements IKarateChop {

    public int runBinarySearchUsingJavaArrays(int[] sortedArray, Integer key) {
        int index = Arrays.binarySearch(sortedArray, key);
        return index;
    }


    @Override
    public int chop(int target, List<Integer> searchArray) {
        return 0;
    }

    public static void example() {

    }
}

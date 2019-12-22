package kata.kata02;

import java.util.Arrays;

public class BinaryChopWithSortedJavaArray {

    public int runBinarySearchUsingJavaArrays(int[] sortedArray, Integer value) {
        int index = Arrays.binarySearch(sortedArray, value);
        return index;
    }
}

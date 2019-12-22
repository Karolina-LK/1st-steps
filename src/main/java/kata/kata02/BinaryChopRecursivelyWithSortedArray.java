package kata.kata02;

public class BinaryChopRecursivelyWithSortedArray {

    public int runBinarySearchRecursively(int[] sortedArray, int value, int low, int high) {

        int middle = (low + high) / 2;
        if (high < low) {
            return -1;
        }

        if (value == sortedArray[middle]) {
            return middle;
        } else if (value < sortedArray[middle]) {
            return runBinarySearchRecursively(sortedArray, value, low, middle - 1);
        } else {
            return runBinarySearchRecursively(sortedArray, value, middle + 1, high);
        }
    }
}

package kata.kata02;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryChopWithSortedArrayTest {

    int[] sortedArray = { 0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9 };
    int value = 6;
    int expectedIndexForSearchKey = 7;
    int low = 0;
    int high = sortedArray.length - 1;
    List<Integer> sortedList = Arrays.asList(0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9);

    @Test
     void shouldGetIndexOfTheNumberFromASortedArray_whenBinarySearchRunRecursivelyForANumber() {
        BinaryChopRecursivelyWithSortedArray binSearch = new BinaryChopRecursivelyWithSortedArray();
        assertEquals(expectedIndexForSearchKey, binSearch.runBinarySearchRecursively(sortedArray, value, low, high));
    }

    @Test
    public void shouldGetIndexOfTheNumberFromSortedArray_whenBinarySearchRunUsingArraysClassStaticMethod() {
        BinaryChopWithSortedJavaArray binSearch = new BinaryChopWithSortedJavaArray();
        assertEquals(expectedIndexForSearchKey, binSearch.runBinarySearchUsingJavaArrays(sortedArray, value));
    }

    @Test
    public void shouldGetIndexOfTheNumberFromSortedList_whenBinarySearchRunUsingCollectionsClassStaticMethod() {
        BinaryChopWithSortedArrayJavaCollections binSearch = new BinaryChopWithSortedArrayJavaCollections();
        assertEquals(expectedIndexForSearchKey, binSearch.runBinarySearchUsingJavaCollections(sortedList, value));
    }


}

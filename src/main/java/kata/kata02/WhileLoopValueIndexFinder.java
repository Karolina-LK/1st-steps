package kata.kata02;

public class WhileLoopValueIndexFinder implements ValueIndexFinder {

    public int findIndex(int value, int[] intsArray) {

        int j = 0;
        while (j < intsArray.length) {
            int val = intsArray[j];
            if (val == value) {
                System.out.println("Searched2 no is at position no " + j);
            return j;
            }
            j++;
        }
       return -1;
    }
}

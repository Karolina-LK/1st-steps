package kata.kata02;

public class ForLoopValueIndexFinder implements ValueIndexFinder {

    public int findIndex(int value, int[] intsArray) {

        for (int i = 0; i < intsArray.length; i++) {
            int val = intsArray[i];
            if (val == value) {
                System.out.println("Searched1 no is at position no " + i);
                return i;
            }
        }
        return -1;
    }
}


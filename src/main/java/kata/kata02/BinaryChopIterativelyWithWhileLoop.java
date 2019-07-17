package kata.kata02;

public class BinaryChopIterativelyWithWhileLoop implements BinaryChopIterativelyInterface {

    public int iterativeChop(int target, int[] intsArray) {

        int j = 0;
        while (j < intsArray.length) {
            int val = intsArray[j];
            if (val == target) {
                System.out.println("Searched2 no is at position no " + j);
            return j;
            }
            j++;
        }
       return -1;
    }
}

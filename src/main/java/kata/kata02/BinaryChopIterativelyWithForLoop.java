package kata.kata02;

public class BinaryChopIterativelyWithForLoop implements BinaryChopIterativelyInterface {

    public int iterativeChop(int target, int[] intsArray) {

        for (int i = 0; i < intsArray.length; i++) {
            int value = intsArray[i];
            if (value == target) {
                System.out.println("Searched1 no is at position no " + i);
                return i;
            }
        }
        return -1;
    }
}


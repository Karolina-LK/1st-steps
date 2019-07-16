package kata.kata02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryChop implements BinarySearchItem {

    public int chop(int target, int[] intsArray) {
        for (int i = 0; i < intsArray.length; i++) {
            int value = intsArray[i];
            if (value == target) {
                System.out.println("Searched1.0 no is at position no " + i);
                return i;

            }
        }
        return -1;
    }


}


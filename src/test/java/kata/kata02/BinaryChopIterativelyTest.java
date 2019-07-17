package kata.kata02;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryChopIterativelyTest {

    @Test
    void shouldReturnPositionOfTheSearchedNoLookedForByBinaryChopIterativelyWithForLoop() {

        BinaryChopIterativelyInterface binaryChop = new BinaryChopIterativelyWithForLoop();

        assertions(binaryChop);

    }

    private void assertions(BinaryChopIterativelyInterface binaryChop) {
        assertThat(binaryChop.iterativeChop(3, new int[]{1})).isEqualTo(-1);
        assertThat(binaryChop.iterativeChop(1, new int[]{1})).isEqualTo(0);
        assertThat(binaryChop.iterativeChop(1, new int[]{1, 3, 5})).isEqualTo(0);
        assertThat(binaryChop.iterativeChop(3, new int[]{1, 3, 5})).isEqualTo(1);
        assertThat(binaryChop.iterativeChop(5, new int[]{1, 3, 5})).isEqualTo(2);
        assertThat(binaryChop.iterativeChop(0, new int[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binaryChop.iterativeChop(2, new int[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binaryChop.iterativeChop(4, new int[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binaryChop.iterativeChop(6, new int[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binaryChop.iterativeChop(1, new int[]{1, 3, 5, 7})).isEqualTo(0);
        assertThat(binaryChop.iterativeChop(3, new int[]{1, 3, 5, 7})).isEqualTo(1);
        assertThat(binaryChop.iterativeChop(5, new int[]{1, 3, 5, 7})).isEqualTo(2);
        assertThat(binaryChop.iterativeChop(7, new int[]{1, 3, 5, 7})).isEqualTo(3);
        assertThat(binaryChop.iterativeChop(0, new int[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binaryChop.iterativeChop(2, new int[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binaryChop.iterativeChop(4, new int[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binaryChop.iterativeChop(6, new int[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binaryChop.iterativeChop(8, new int[]{1, 3, 5, 7})).isEqualTo(-1);
    }

    @Test
    void shouldReturnPositionOfTheSearchedNoLookedForByBinaryChopIterativelyWithWhileLoop() {

        BinaryChopIterativelyInterface binaryChop2 = new BinaryChopIterativelyWithWhileLoop();

        assertions(binaryChop2);
    }
}
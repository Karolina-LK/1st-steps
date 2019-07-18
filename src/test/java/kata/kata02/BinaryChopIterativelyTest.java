package kata.kata02;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryChopIterativelyTest {

    @Test
    void shouldReturnPositionOfTheSearchedNoLookedForByBinaryChopIterativelyWithForLoop() {

        ValueIndexFinder binaryChop = new ForLoopValueIndexFinder();

        assertions(binaryChop);

    }

    private void assertions(ValueIndexFinder binaryChop) {
        assertThat(binaryChop.findIndex(3, new int[]{1})).isEqualTo(-1);
        assertThat(binaryChop.findIndex(1, new int[]{1})).isEqualTo(0);
        assertThat(binaryChop.findIndex(1, new int[]{1, 3, 5})).isEqualTo(0);
        assertThat(binaryChop.findIndex(3, new int[]{1, 3, 5})).isEqualTo(1);
        assertThat(binaryChop.findIndex(5, new int[]{1, 3, 5})).isEqualTo(2);
        assertThat(binaryChop.findIndex(0, new int[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binaryChop.findIndex(2, new int[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binaryChop.findIndex(4, new int[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binaryChop.findIndex(6, new int[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binaryChop.findIndex(1, new int[]{1, 3, 5, 7})).isEqualTo(0);
        assertThat(binaryChop.findIndex(3, new int[]{1, 3, 5, 7})).isEqualTo(1);
        assertThat(binaryChop.findIndex(5, new int[]{1, 3, 5, 7})).isEqualTo(2);
        assertThat(binaryChop.findIndex(7, new int[]{1, 3, 5, 7})).isEqualTo(3);
        assertThat(binaryChop.findIndex(0, new int[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binaryChop.findIndex(2, new int[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binaryChop.findIndex(4, new int[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binaryChop.findIndex(6, new int[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binaryChop.findIndex(8, new int[]{1, 3, 5, 7})).isEqualTo(-1);
    }

    @Test
    void shouldReturnPositionOfTheSearchedNoLookedForByBinaryChopIterativelyWithWhileLoop() {

        ValueIndexFinder binaryChop2 = new WhileLoopValueIndexFinder();

        assertions(binaryChop2);
    }
}
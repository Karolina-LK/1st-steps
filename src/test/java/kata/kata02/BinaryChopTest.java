package kata.kata02;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryChopTest {


    @Test
    void shouldReturnPositionOfTheSearchedNoLookedForByBinaryChop() {

     BinarySearchItem binaryChop = new BinaryChop();


        assertions(binaryChop);

    }

    private void assertions(BinarySearchItem binaryChop) {
        assertThat(binaryChop.chop(3, new int[]{1})).isEqualTo(-1);
        assertThat(binaryChop.chop(1, new int[]{1})).isEqualTo(0);

        assertThat(binaryChop.chop(1, new int[]{1, 3, 5})).isEqualTo(0);
        assertThat(binaryChop.chop(3, new int[]{1, 3, 5})).isEqualTo(1);
        assertThat(binaryChop.chop(5, new int[]{1, 3, 5})).isEqualTo(2);
        assertThat(binaryChop.chop(0, new int[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binaryChop.chop(2, new int[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binaryChop.chop(4, new int[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binaryChop.chop(6, new int[]{1, 3, 5})).isEqualTo(-1);
        assertThat(binaryChop.chop(1, new int[]{1, 3, 5, 7})).isEqualTo(0);
        assertThat(binaryChop.chop(3, new int[]{1, 3, 5, 7})).isEqualTo(1);
        assertThat(binaryChop.chop(5, new int[]{1, 3, 5, 7})).isEqualTo(2);
        assertThat(binaryChop.chop(7, new int[]{1, 3, 5, 7})).isEqualTo(3);
        assertThat(binaryChop.chop(0, new int[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binaryChop.chop(2, new int[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binaryChop.chop(4, new int[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binaryChop.chop(6, new int[]{1, 3, 5, 7})).isEqualTo(-1);
        assertThat(binaryChop.chop(8, new int[]{1, 3, 5, 7})).isEqualTo(-1);
    }

    @Test
  void shouldReturnPositionOfTheSearchedNoLookedForByBinaryChop2() {
      BinarySearchItem binaryChop2 = new BinaryChop2();

        assertions(binaryChop2);
    }

}
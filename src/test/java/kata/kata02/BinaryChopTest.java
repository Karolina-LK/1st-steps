package kata.kata02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryChopTest {


    @Test
    void name() {

        BinaryChop binaryChop = new BinaryChop();

       assertThat(binaryChop.chop(3, new int[] {}));
        //assertThat(-1, binaryChop.chop(3, new int [] {1}));
       // assertThat(0); binaryChop.chop(1, new int [] {1});

//        assertThat(0; binaryChop.chop(1, new int [] {1, 3, 5});
//        assertThat(1; binaryChop.chop(3, new int [] {1, 3, 5});
//        assertThat(2; binaryChop.chop(5, new int [] {1, 3, 5});
//        assertThat(-1; binaryChop.chop(0, new int [] {1, 3, 5});
//        assertThat(-1; binaryChop.chop(2, new int [] {1, 3, 5});
//        assertThat(-1; binaryChop.chop(4, new int [] {1, 3, 5});
//        assertThat(-1; binaryChop.chop(6, new int [] {1, 3, 5});
//
//        assertThat(0; binaryChop.chop(1, new int [] {1, 3, 5, 7});
//        assertThat(1; binaryChop.chop(3, new int [] {1, 3, 5, 7});
//        assertThat(2; binaryChop.chop(5, new int [] {1, 3, 5, 7});
//        assertThat(3; binaryChop.chop(7, new int [] {1, 3, 5, 7});
//        assertThat(-1; binaryChop.chop(0, new int [] {1, 3, 5, 7});
//        assertThat(-1; binaryChop.chop(2, new int [] {1, 3, 5, 7});
//        assertThat(-1; binaryChop.chop(4, new int [] {1, 3, 5, 7});
//        assertThat(-1; binaryChop.chop(6, new int [] {1, 3, 5, 7});
//        assertThat(-1; binaryChop.chop(8, new int [] {1, 3, 5, 7});
    }

}
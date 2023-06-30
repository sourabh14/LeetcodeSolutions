import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextPermutationTest {

    @Test
    void nextPermutation() {
        int[] input = {1, 3, 2, 7, 3, 5};
        new NextPermutation().printNums(input);
        Arrays.sort(input, 1, 2);
        System.out.println("Input: ");
        new NextPermutation().printNums(input);
//        new NextPermutation().nextPermutation(input);
    }
}
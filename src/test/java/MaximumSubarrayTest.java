import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    @Test
    void maxSubArray() {
        int[] input1 = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, new MaximumSubarray().maxSubArray(input1));
        int[] input2 = {1};
        assertEquals(1, new MaximumSubarray().maxSubArray(input2));
        int[] input3 = {5,4,-1,7,8};
        assertEquals(23, new MaximumSubarray().maxSubArray(input3));
    }
}
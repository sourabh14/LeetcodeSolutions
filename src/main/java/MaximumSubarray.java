public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSubArraySumAtIndex = nums[0];
        int maxSubArraySum = nums[0];

        for (int i=1; i<nums.length; i++) {
            maxSubArraySumAtIndex = Math.max(nums[i], nums[i] + maxSubArraySumAtIndex);
            maxSubArraySum = Math.max(maxSubArraySum, maxSubArraySumAtIndex);
        }

        return maxSubArraySum;
    }
}

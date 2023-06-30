import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i;
        printNums(nums);
        for (i=n-2; i>=0; i--) {
            System.out.println("i: " + i);
            if (nums[i] < nums[n-1]) {
                int k = nums[i];
                nums[i] = nums[n-1];
                nums[n-1] = k;

                printNums(nums);
                Arrays.sort(nums, i+1, n-1);
                printNums(nums);
                return;
            }
        }

        for (int j=0; j<n/2; j++) {
            int k = nums[j];
            nums[j] = nums[n-j-1];
            nums[n-j-1] = k;
        }
    }

    public void printNums(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("");
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i];
                lastNonZeroFoundAt++;
            }
        }

        // Fill remaining positions with zeroes
        while (lastNonZeroFoundAt < nums.length) {
            nums[lastNonZeroFoundAt] = 0;
            lastNonZeroFoundAt++;
        }
    }
}
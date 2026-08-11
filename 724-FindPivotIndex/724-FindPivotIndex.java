// Last updated: 8/11/2026, 9:58:29 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0, left = 0;

        for (int n : nums)
            sum += n;

        for (int i = 0; i < nums.length; i++) {
            if (left == sum - left - nums[i])
                return i;

            left += nums[i];
        }

        return -1;
    }
}
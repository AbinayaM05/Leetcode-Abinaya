// Last updated: 8/11/2026, 10:04:30 PM
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(rob(nums, 0, nums.length - 2),
                        rob(nums, 1, nums.length - 1));
    }
    int rob(int[] a, int start, int end) {
        int prev = 0, curr = 0;
        for (int i = start; i <= end; i++) {
            int temp = Math.max(curr, prev + a[i]);
            prev = curr;
            curr = temp;
        }
        return curr;
    }
}
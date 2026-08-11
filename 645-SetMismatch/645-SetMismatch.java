// Last updated: 8/11/2026, 9:58:51 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int x = Math.abs(nums[i]) - 1;
            if (nums[x] < 0)
                ans[0] = x + 1;
            else
                nums[x] = -nums[x];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                ans[1] = i + 1;
        }
        return ans;
    }
}
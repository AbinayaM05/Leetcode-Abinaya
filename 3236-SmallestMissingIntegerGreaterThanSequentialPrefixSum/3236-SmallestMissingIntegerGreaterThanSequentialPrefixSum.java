// Last updated: 8/11/2026, 9:51:35 PM
class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0], i = 1;
        while (i < nums.length && nums[i] == nums[i - 1] + 1)
            sum += nums[i++];
        while (true) {
            boolean ok = true;
            for (int n : nums)
                if (n == sum)
                    ok = false;
            if (ok)
                return sum;
            sum++;
        }
    }
}
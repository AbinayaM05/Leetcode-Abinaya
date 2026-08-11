// Last updated: 8/11/2026, 10:03:46 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0,x,i;
        for (i=0;i<n;i++) {
            sum += nums[i];
        }
        x= n * (n + 1) / 2;
        return x- sum;
    }
}

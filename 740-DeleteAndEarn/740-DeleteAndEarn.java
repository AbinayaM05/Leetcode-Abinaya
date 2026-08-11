// Last updated: 8/11/2026, 9:57:49 PM
class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] sum = new int[10001];
        for (int x : nums) {
            sum[x] += x;
        }
        int prev = 0;
        int curr = 0;
        for (int i = 0; i <= 10000; i++) {
            int temp = curr;
            curr = Math.max(curr, prev + sum[i]);
            prev = temp;
        }
        return curr;
    }
}
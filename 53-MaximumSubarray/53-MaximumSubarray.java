// Last updated: 8/11/2026, 10:07:58 PM
class Solution {
    public int maxSubArray(int[] a) {
        int sum = 0, max = a[0];
        for (int x : a) {
            sum += x;
            if (sum > max) max = sum;
            if (sum < 0) sum = 0;
        }
        return max;
    }
}
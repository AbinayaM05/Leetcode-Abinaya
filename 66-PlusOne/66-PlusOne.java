// Last updated: 8/11/2026, 10:07:43 PM
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) {
                return digits;
            }
            digits[i] = 0;
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}
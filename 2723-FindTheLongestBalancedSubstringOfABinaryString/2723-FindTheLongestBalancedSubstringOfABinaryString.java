// Last updated: 8/11/2026, 9:52:14 PM
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            int zero = 0, one = 0;
            int j = i;

            while (j < s.length() && s.charAt(j) == '0') {
                zero++;
                j++;
            }

            while (j < s.length() && s.charAt(j) == '1') {
                one++;
                j++;
            }

            max = Math.max(max, 2 * Math.min(zero, one));
        }

        return max;
    }
}
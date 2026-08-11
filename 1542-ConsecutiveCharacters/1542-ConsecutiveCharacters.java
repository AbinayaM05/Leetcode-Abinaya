// Last updated: 8/11/2026, 9:54:15 PM
class Solution {
    public int maxPower(String s) {
        int max = 1, count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1))
                count++;
            else
                count = 1;

            if (count > max)
                max = count;
        }

        return max;
    }
}
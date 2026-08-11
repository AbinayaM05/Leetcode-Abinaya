// Last updated: 8/11/2026, 9:53:39 PM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    max = Math.max(max, j - i - 1);
                    break;
                }
            }
        }

        return max;
    }
}
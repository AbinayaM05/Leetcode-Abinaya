// Last updated: 8/11/2026, 9:58:49 PM
class Solution {
    int count = 0;

    public int countSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i);       
            expand(s, i, i + 1);   
        }
        return count;
    }

    private void expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
    }
}
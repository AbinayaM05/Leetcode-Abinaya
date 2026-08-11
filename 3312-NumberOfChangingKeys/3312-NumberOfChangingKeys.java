// Last updated: 8/11/2026, 9:51:19 PM
class Solution {
    public int countKeyChanges(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1))
                count++;
        }

        return count;
    }
}
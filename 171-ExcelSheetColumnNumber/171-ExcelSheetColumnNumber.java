// Last updated: 8/11/2026, 10:05:57 PM
class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            num = num * 26;
            num = num + (ch - 'A' + 1);
        }
        return num;
    }
}
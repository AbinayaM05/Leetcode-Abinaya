// Last updated: 8/11/2026, 10:02:07 PM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1, (s + s).length() - 1).contains(s);
    }
}
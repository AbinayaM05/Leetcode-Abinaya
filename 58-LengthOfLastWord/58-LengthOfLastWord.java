// Last updated: 8/11/2026, 10:07:55 PM
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.substring(s.lastIndexOf(" ") + 1).length();
    }
}

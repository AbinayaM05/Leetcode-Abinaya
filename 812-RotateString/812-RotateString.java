// Last updated: 8/11/2026, 9:57:01 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
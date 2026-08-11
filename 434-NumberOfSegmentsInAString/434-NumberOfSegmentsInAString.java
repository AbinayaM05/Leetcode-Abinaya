// Last updated: 8/11/2026, 10:02:24 PM
class Solution {
    public int countSegments(String s) {
        s = s.trim();

        if (s.length() == 0)
            return 0;

        return s.split("\\s+").length;
    }
}
// Last updated: 8/11/2026, 10:03:00 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (char c : ransomNote.toCharArray()) {
            int i = magazine.indexOf(c);
            if (i == -1) return false;
            magazine = magazine.substring(0, i) + magazine.substring(i + 1);
        }
        return true;
    }
}
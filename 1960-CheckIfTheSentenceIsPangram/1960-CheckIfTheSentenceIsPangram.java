// Last updated: 8/11/2026, 9:53:21 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1)
                return false;
        }

        return true;
    }
}
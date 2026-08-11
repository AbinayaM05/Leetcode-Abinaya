// Last updated: 8/11/2026, 10:06:03 PM
class Solution {
    public String convertToTitle(int n) {
        String s = "";
        while (n > 0) {
            n--;
            s = (char)('A' + n % 26) + s;
            n = n / 26;
        }
        return s;
    }
}
// Last updated: 8/11/2026, 9:53:26 PM
class Solution {
    public String truncateSentence(String s, int k) {
        String[] a = s.split(" ");
        String ans = "";

        for (int i = 0; i < k; i++) {
            ans += a[i] + " ";
        }

        return ans.trim();
    }
}
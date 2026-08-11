// Last updated: 8/11/2026, 10:00:27 PM
class Solution {
    public String reverseWords(String s) {
        String[] a = s.split(" ");
        String ans = "";

        for (String w : a) {
            ans += new StringBuilder(w).reverse().toString() + " ";
        }

        return ans.trim();
    }
}
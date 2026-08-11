// Last updated: 8/11/2026, 9:53:20 PM
class Solution {
    public String sortSentence(String s) {
        String[] a = s.split(" ");
        String[] ans = new String[a.length];

        for (String w : a) {
            int i = w.charAt(w.length() - 1) - '1';
            ans[i] = w.substring(0, w.length() - 1);
        }

        return String.join(" ", ans);
    }
}
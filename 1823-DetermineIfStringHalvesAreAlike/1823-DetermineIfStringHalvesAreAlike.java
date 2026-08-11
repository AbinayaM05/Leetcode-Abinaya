// Last updated: 8/11/2026, 9:53:28 PM
class Solution {
    public boolean halvesAreAlike(String s) {
        String v = "aeiouAEIOU";
        int a = 0, b = 0;

        for (int i = 0; i < s.length() / 2; i++)
            if (v.indexOf(s.charAt(i)) != -1)
                a++;

        for (int i = s.length() / 2; i < s.length(); i++)
            if (v.indexOf(s.charAt(i)) != -1)
                b++;

        return a == b;
    }
}
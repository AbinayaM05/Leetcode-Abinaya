// Last updated: 8/11/2026, 9:53:13 PM
class Solution {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];

        for (String s : words)
            for (char c : s.toCharArray())
                count[c - 'a']++;

        for (int i = 0; i < 26; i++)
            if (count[i] % words.length != 0)
                return false;

        return true;
    }
}
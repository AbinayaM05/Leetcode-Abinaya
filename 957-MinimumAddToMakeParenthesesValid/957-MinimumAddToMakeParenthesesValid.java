// Last updated: 8/11/2026, 9:56:22 PM
class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0, ans = 0;
        for (char c : s.toCharArray()) {
            if (c == '(')
                open++;
            else if (open > 0)
                open--;
            else
                ans++;
        }
        return open + ans;
    }
}


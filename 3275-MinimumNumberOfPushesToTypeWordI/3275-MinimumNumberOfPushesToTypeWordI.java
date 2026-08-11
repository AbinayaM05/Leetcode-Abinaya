// Last updated: 8/11/2026, 9:51:21 PM
class Solution {
    public int minimumPushes(String word) {
        int ans = 0;

        for (int i = 0; i < word.length(); i++) {
            ans += i / 8 + 1;
        }

        return ans;
    }
}
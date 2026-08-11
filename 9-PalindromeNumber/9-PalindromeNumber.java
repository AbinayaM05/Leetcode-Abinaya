// Last updated: 8/11/2026, 10:26:19 PM
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int num = x,ans=0,d; 
        while (x != 0) {
            d = x % 10;
            x /= 10;
            ans = ans * 10 + d;
        }
        return num == ans; 
    }
}

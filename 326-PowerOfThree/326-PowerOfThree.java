// Last updated: 8/11/2026, 10:03:24 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;  
        
        while (n % 3 == 0) {
            n /= 3;
        }
        
        return n == 1;
    }
}

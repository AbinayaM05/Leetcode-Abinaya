// Last updated: 8/11/2026, 10:03:19 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) 
        return false; 
        
        while (n % 4== 0) {
            n =n/4;
        }
        
        return n==1;
    }
}

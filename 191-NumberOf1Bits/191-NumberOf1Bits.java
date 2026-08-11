// Last updated: 8/11/2026, 10:05:07 PM
public class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); 
            count++;
        }
        return count;
    }
}

    
    



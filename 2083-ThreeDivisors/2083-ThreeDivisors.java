// Last updated: 8/11/2026, 9:53:12 PM
class Solution {
    public boolean isThree(int n) {
        int sqrt = (int)Math.sqrt(n);
        if (sqrt * sqrt != n) 
        return false; 
        for (int i = 2; i * i <= sqrt; i++)
            if (sqrt % i == 0) 
            return false;
        return sqrt > 1;
    }
}

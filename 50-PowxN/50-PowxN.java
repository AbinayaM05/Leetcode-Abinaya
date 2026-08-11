// Last updated: 8/11/2026, 10:08:07 PM
class Solution {
    public double myPow(double x, int n) {
        long p = n;
        double ans = 1;
        if (p < 0) {
            x = 1 / x;
            p = -p;
        }
        while (p > 0) {
            if (p % 2 == 1) {
                ans *= x;
            }
            x *= x;
            p /= 2;
        }
        return ans;
    }
}
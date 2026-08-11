// Last updated: 8/11/2026, 9:56:07 PM
class Solution {
    public int fib(int n) {
        int f1 = 0, f2 = 1, f = 0;
        if (n == 0) return 0;
        if (n == 1) return 1; 
        for (int i = 2; i <= n; i++) {
            f = f1 + f2; 
            f1 = f2;    
            f2 = f;     
        }
        return f;
    }
}

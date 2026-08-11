// Last updated: 8/11/2026, 9:54:45 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int p = 1,s=0,d;
        while (n > 0) {
            d = n % 10;  
            p *= d;     
            s += d;         
            n /= 10;              
        }
        return p-s;     
    }
}

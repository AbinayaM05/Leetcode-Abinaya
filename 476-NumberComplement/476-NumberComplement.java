// Last updated: 8/11/2026, 10:01:54 PM
class Solution {
    public int findComplement(int n) {
        int m = 0;
        int temp = n;
            while (temp != 0) {
            m = (m << 1) | 1;
            temp >>= 1;
        }
        return n ^ m;
    }
}

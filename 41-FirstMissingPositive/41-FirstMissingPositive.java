// Last updated: 8/11/2026, 10:08:47 PM
class Solution {
    public int firstMissingPositive(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            while (a[i] > 0 && a[i] <= n && a[a[i] - 1] != a[i]) {
                int t = a[i];
                a[i] = a[t - 1];
                a[t - 1] = t;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] != i + 1) return i + 1;
        }
        return n + 1;
    }
}
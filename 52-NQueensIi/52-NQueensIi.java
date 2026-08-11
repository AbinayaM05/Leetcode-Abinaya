// Last updated: 8/11/2026, 10:08:00 PM
class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        solve(new int[n], 0, n);
        return count;
    }
    void solve(int[] a, int row, int n) {
        if (row == n) {
            count++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (safe(a, row, col)) {
                a[row] = col;
                solve(a, row + 1, n);
            }
        }
    }
    boolean safe(int[] a, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (a[i] == col || Math.abs(a[i] - col) == Math.abs(i - row))
                return false;
        }
        return true;
    }
}
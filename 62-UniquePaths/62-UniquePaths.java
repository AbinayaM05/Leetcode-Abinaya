// Last updated: 8/11/2026, 10:07:52 PM
class Solution {
    int[][] dp = new int[101][101];
    int fun(int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1)
            return 1;
        if (i >= m || j >= n)
            return 0;
        if (dp[i][j] != 0)
            return dp[i][j];
        dp[i][j] = fun(i, j + 1, m, n) + fun(i + 1, j, m, n);
        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        return fun(0, 0, m, n);
    }
}
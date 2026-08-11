// Last updated: 8/11/2026, 10:01:40 PM
import java.util.*;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++)
            idx[i] = i;
        Arrays.sort(idx, (a, b) -> score[b] - score[a]);
        for (int i = 0; i < n; i++) {
            if (i == 0)
                ans[idx[i]] = "Gold Medal";
            else if (i == 1)
                ans[idx[i]] = "Silver Medal";
            else if (i == 2)
                ans[idx[i]] = "Bronze Medal";
            else
                ans[idx[i]] = String.valueOf(i + 1);
        }
        return ans;
    }
}
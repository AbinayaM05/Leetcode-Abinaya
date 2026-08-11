// Last updated: 8/11/2026, 9:57:30 PM
class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int prev2 = cost[0];
        int prev1 = cost[1];

        for (int i = 2; i < cost.length; i++) {

            int curr = cost[i] + Math.min(prev2, prev1);

            prev2 = prev1;
            prev1 = curr;
        }

        return Math.min(prev1, prev2);
    }
}
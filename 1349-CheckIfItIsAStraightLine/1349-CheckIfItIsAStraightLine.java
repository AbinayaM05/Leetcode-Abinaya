// Last updated: 8/11/2026, 9:54:53 PM
class Solution {
    public boolean checkStraightLine(int[][] c) {
        for (int i = 2; i < c.length; i++) {
            if ((c[1][1] - c[0][1]) * (c[i][0] - c[0][0]) !=
                (c[i][1] - c[0][1]) * (c[1][0] - c[0][0])) {
                return false;
            }
        }
        return true;
    }
}
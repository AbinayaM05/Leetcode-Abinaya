// Last updated: 8/11/2026, 9:56:01 PM
import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0, time = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2)
                    q.offer(new int[]{i, j});
                if (grid[i][j] == 1)
                    fresh++;
            }
        }

        int[][] d = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();

            while (size-- > 0) {
                int[] x = q.poll();

                for (int[] i : d) {
                    int r = x[0] + i[0];
                    int c = x[1] + i[1];

                    if (r >= 0 && c >= 0 &&
                        r < grid.length && c < grid[0].length &&
                        grid[r][c] == 1) {

                        grid[r][c] = 2;
                        fresh--;
                        q.offer(new int[]{r, c});
                    }
                }
            }
            time++;
        }

        return fresh == 0 ? time : -1;
    }
}
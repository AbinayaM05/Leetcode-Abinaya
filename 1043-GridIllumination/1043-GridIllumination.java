// Last updated: 8/11/2026, 9:55:59 PM
import java.util.*;

class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {

        Map<Integer, Integer> row = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();
        Map<Integer, Integer> diag = new HashMap<>();
        Map<Integer, Integer> anti = new HashMap<>();

        Set<Long> lampSet = new HashSet<>();

        for (int[] lamp : lamps) {
            int r = lamp[0];
            int c = lamp[1];

            long key = (long) r * n + c;

            if (!lampSet.add(key)) {
                continue;
            }

            row.put(r, row.getOrDefault(r, 0) + 1);
            col.put(c, col.getOrDefault(c, 0) + 1);
            diag.put(r - c, diag.getOrDefault(r - c, 0) + 1);
            anti.put(r + c, anti.getOrDefault(r + c, 0) + 1);
        }

        int[] ans = new int[queries.length];

        int[][] dirs = {
            {0, 0}, {0, 1}, {0, -1},
            {1, 0}, {-1, 0},
            {1, 1}, {1, -1},
            {-1, 1}, {-1, -1}
        };

        for (int i = 0; i < queries.length; i++) {

            int r = queries[i][0];
            int c = queries[i][1];

            if (row.containsKey(r) ||
                col.containsKey(c) ||
                diag.containsKey(r - c) ||
                anti.containsKey(r + c)) {
                ans[i] = 1;
            }

            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr < 0 || nr >= n || nc < 0 || nc >= n) {
                    continue;
                }

                long key = (long) nr * n + nc;

                if (lampSet.remove(key)) {

                    row.put(nr, row.get(nr) - 1);
                    if (row.get(nr) == 0) row.remove(nr);

                    col.put(nc, col.get(nc) - 1);
                    if (col.get(nc) == 0) col.remove(nc);

                    diag.put(nr - nc, diag.get(nr - nc) - 1);
                    if (diag.get(nr - nc) == 0) diag.remove(nr - nc);

                    anti.put(nr + nc, anti.get(nr + nc) - 1);
                    if (anti.get(nr + nc) == 0) anti.remove(nr + nc);
                }
            }
        }

        return ans;
    }
}
// Last updated: 8/11/2026, 10:06:18 PM
import java.util.*;

class Solution {
    public int maxPoints(int[][] p) {
        int n = p.length;
        if (n <= 2) return n;

        int res = 0;

        for (int i = 0; i < n; i++) {
            Map<String, Integer> map = new HashMap<>();
            int same = 1, best = 0;

            for (int j = i + 1; j < n; j++) {
                int dx = p[j][0] - p[i][0];
                int dy = p[j][1] - p[i][1];

                if (dx == 0 && dy == 0) {
                    same++;
                    continue;
                }

                int g = gcd(dx, dy);
                dx /= g;
                dy /= g;

                // FIX: normalize sign (VERY IMPORTANT)
                if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                }

                String key = dx + "/" + dy;
                map.put(key, map.getOrDefault(key, 0) + 1);
                best = Math.max(best, map.get(key));
            }

            res = Math.max(res, best + same);
        }

        return res;
    }

    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
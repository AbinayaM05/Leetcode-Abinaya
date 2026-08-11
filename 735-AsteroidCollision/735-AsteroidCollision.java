// Last updated: 8/11/2026, 9:58:06 PM
import java.util.*;
class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> s = new Stack<>();
        for (int x : a) {
            while (!s.isEmpty() && s.peek() > 0 && x < 0) {
                if (s.peek() < -x) {
                    s.pop();
                    continue;
                }
                if (s.peek() == -x) {
                    s.pop();
                }
                x = 0;
            }
            if (x != 0) {
                s.push(x);
            }
        }
        int[] ans = new int[s.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = s.pop();
        }
        return ans;
    }
}
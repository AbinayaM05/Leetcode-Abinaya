// Last updated: 8/11/2026, 9:58:00 PM
import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int j = st.pop();
                ans[j] = i - j;
            }
            st.push(i);
        }
        return ans;
    }
}
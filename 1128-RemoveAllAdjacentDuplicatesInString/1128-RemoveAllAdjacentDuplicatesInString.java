// Last updated: 8/11/2026, 9:55:48 PM

import java.util.*;
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty()) {
                char top = st.pop();
                if (top != c) {
                    st.push(top);
                    st.push(c);
                }
            } else {
                st.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char ch : st) {
            ans.append(ch);
        }
        return ans.toString();
    }
}
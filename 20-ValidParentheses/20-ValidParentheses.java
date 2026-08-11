// Last updated: 8/11/2026, 10:26:10 PM
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty())
                 return false;
                char top = st.pop();
                if (!matchingPair(c, top))
                    return false;
            }
        }
        return st.isEmpty();
    }
    public boolean matchingPair(char c, char top) {
        return (c == ')' && top == '(') ||
               (c == '}' && top == '{') ||
               (c == ']' && top == '[');
    }
}